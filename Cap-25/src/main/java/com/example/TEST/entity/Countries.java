package com.example.TEST.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


public class Countries {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CountryId;
	private String Name;
	private Integer RegionId;

	@OneToMany
	@JoinColumn(name = "Country_id")
	private List<Customers> customers;
	@OneToMany
	@JoinColumn(name = "Region_id")
	private List<Regions> regions;



	@OneToOne(mappedBy = "Name")
	private ConuntriesCurrencies countriesCurrencies;



	public int getCountryId() {
	return CountryId;
	}



	public void setCountryId(int countryId) {
	CountryId = countryId;
	}



	public String getName() {
	return Name;
	}



	public void setName(String name) {
	Name = name;
	}



	public int getRegionId() {
	return RegionId;
	}



	public void setRegionId(int regionId) {
	RegionId = regionId;
	}



	public List<Customers> getCustomers() {
	return customers;
	}



	public void setCustomers(List<Customers> customers) {
	this.customers = customers;
	}



	public List<Regions> getRegions() {
	return regions;
	}



	public void setRegions(List<Regions> regions) {
	this.regions = regions;
	}



	public ConuntriesCurrencies getCountriesCurrencies() {
	return countriesCurrencies;
	}



	public void setCountriesCurrencies(ConuntriesCurrencies countriesCurrencies) {
	this.countriesCurrencies = countriesCurrencies;
	}



	@Override
	public int hashCode() {
	return Objects.hash(CountryId, Name, RegionId, ConuntriesCurrencies, customers, regions);
	}



	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Countries other = (Countries) obj;
	return CountryId == other.CountryId && Objects.equals(Name, other.Name) && RegionId == other.RegionId
	&& Objects.equals(countriesCurrencies, other.countriesCurrencies)
	&& Objects.equals(customers, other.customers) && Objects.equals(regions, other.regions);
	}



	public Countries() {
	super();
	// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
	return "Countries [CountryId=" + CountryId + ", Name=" + Name + ", RegionId=" + RegionId + ", customers="
	+ customers + ", regions=" + regions + ", countriesCurrencies=" + countriesCurrencies + "]";
	}

	
	
	
}