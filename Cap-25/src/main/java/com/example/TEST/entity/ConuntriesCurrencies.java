package com.example.TEST.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ConuntriesCurrencies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cuntryId;
	private Integer CurrencyId;
	
	@OneToOne
	@JoinColumn(name= "Country_Id")
	private Currencies currencies;
	
	@OneToOne
	@JoinColumn(name = "Country_Id")
	private Countries countries;



	public int getCountryId() {
	return CountryId;
	}



	public void setCountryId(int countryId) {
	CountryId = countryId;
	}



	public int getCurrencyId() {
	return CurrencyId;
	}



	public void setCurrencyId(int currencyId) {
	CurrencyId = currencyId;
	}



	public Currencies getCurrencies() {
	return currencies;
	}



	public void setCurrencies(Currencies currencies) {
	this.currencies = currencies;
	}



	public Countries getCountries() {
	return countries;
	}



	public void setCountries(Countries countries) {
	this.countries = countries;
	}



	@Override
	public int hashCode() {
	return Objects.hash(CountryId, CurrencyId, countries, currencies);
	}



	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	CountriesCurrencies other = (CountriesCurrencies) obj;
	return CountryId == other.CountryId && CurrencyId == other.CurrencyId
	&& Objects.equals(countries, other.countries) && Objects.equals(currencies, other.currencies);
	}



	public CountriesCurrencies() {
	super();
	// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
	return "CountriesCurrencies [CountryId=" + CountryId + ", CurrencyId=" + CurrencyId + ", currencies="
	+ currencies + ", countries=" + countries + "]";
	}
}
