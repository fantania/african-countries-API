package com.fantania.africanCountriesAPI.service;

import java.util.List;

import com.fantania.africanCountriesAPI.model.AfricanCountry;

public interface AfricanCountryService {
	
	public AfricanCountry searchByName(String name);
	public AfricanCountry searchByCapital(String capital);
	public AfricanCountry searchByCallingCode(String callingCode);
	public AfricanCountry searchByAlpha3Code(String alpha3Code);
	public List<AfricanCountry> searchBySubRegion(String subRegion);
	public List<AfricanCountry> searchByLanguage(String language);
	public List<AfricanCountry> getAllCountries();

}
