package com.example.TEST.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Currencies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CurrencyId;
	private String Name;
	
	
	@OneToOne(mappedBy ="CurrencyId" )
	private ConuntriesCurrencies countriesCurrencies;



	@OneToMany(cascade = CascadeType.ALL)
	private List<Sales> sales;



	public int getCurrencyId() {
	return CurrencyId;
	}



	public void setCurrencyId(int currencyId) {
	CurrencyId = currencyId;
	}



	public String getName() {
	return Name;
	}



	public void setName(String name) {
	Name = name;
	}



	public ConuntriesCurrencies getCountriesCurrencies() {
	return countriesCurrencies;
	}



	public void setCountriesCurrencies(ConuntriesCurrencies countriesCurrencies) {
	this.countriesCurrencies = countriesCurrencies;
	}



	public List<Sales> getSales() {
	return sales;
	}



	public void setSales(List<Sales> sales) {
	this.sales = sales;
	}



	public Currencies() {
	super();
	// TODO Auto-generated constructor stub
	}



	@Override
	public int hashCode() {
	return Objects.hash(CurrencyId, Name, countriesCurrencies, sales);
	}



	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Currencies other = (Currencies) obj;
	return CurrencyId == other.CurrencyId && Objects.equals(Name, other.Name)
	&& Objects.equals(countriesCurrencies, other.countriesCurrencies) && Objects.equals(sales, other.sales);
	}



	@Override
	public String toString() {
	return "Currencies [CurrencyId=" + CurrencyId + ", Name=" + Name + ", countriesCurrencies=" + countriesCurrencies
	+ ", sales=" + sales + "]";
	}


	
	
}
