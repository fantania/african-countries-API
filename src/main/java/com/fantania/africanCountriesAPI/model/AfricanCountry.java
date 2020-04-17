package com.fantania.africanCountriesAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country")
public class AfricanCountry {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String callingCode;
	private String capital;
	private String subRegion;
	private String population;;
	private String timeZones;
	private String borders;
	private String currency;
	private String languages;
	private String domain;
	private String alpha3Code;
	private String altSpelling;
	private String area;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCallingCode() {
		return callingCode;
	}
	public void setCallingCode(String callingCode) {
		this.callingCode = callingCode;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getSubRegion() {
		return subRegion;
	}
	public void setSubRegion(String subRegion) {
		this.subRegion = subRegion;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getTimeZones() {
		return timeZones;
	}
	public void setTimeZones(String timeZones) {
		this.timeZones = timeZones;
	}
	public String getBorders() {
		return borders;
	}
	public void setBorders(String borders) {
		this.borders = borders;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getAlpha3Code() {
		return alpha3Code;
	}
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}
	public String getAltSpelling() {
		return altSpelling;
	}
	public void setAltSpelling(String altSpelling) {
		this.altSpelling = altSpelling;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "AfricanCountry [id=" + id + ", name=" + name + ", callingCode=" + callingCode + ", capital=" + capital
				+ ", subRegion=" + subRegion + ", population=" + population + ", timeZones=" + timeZones + ", borders="
				+ borders + ", currency=" + currency + ", languages=" + languages + ", domain=" + domain
				+ ", alpha3Code=" + alpha3Code + ", altSpelling=" + altSpelling + ", area=" + area + "]";
	}
	
	

}
