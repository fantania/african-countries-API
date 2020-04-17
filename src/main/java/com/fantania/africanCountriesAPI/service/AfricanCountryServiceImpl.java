package com.fantania.africanCountriesAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fantania.africanCountriesAPI.exception.CountryNotFoundException;
import com.fantania.africanCountriesAPI.exception.GeneralException;
import com.fantania.africanCountriesAPI.model.AfricanCountry;
import com.fantania.africanCountriesAPI.repository.AfricanCountryRepository;

@Service
public class AfricanCountryServiceImpl implements AfricanCountryService{
	
	private static  final Logger LOGGER = LoggerFactory.getLogger(AfricanCountryServiceImpl.class);

	@Autowired
	private AfricanCountryRepository repository;

	@Override
	public AfricanCountry searchByName(String name) throws CountryNotFoundException, GeneralException{
		AfricanCountry country = new AfricanCountry();
		try {
			country = repository.searchByName(name);
			if(country==null) {
			throw new CountryNotFoundException("COUNTRY NOT FOUND");
		}
		}catch(CountryNotFoundException e) {
			throw new CountryNotFoundException("COUNTRY NOT FOUND");
		}catch(Exception e) {
			LOGGER.error("Exception: INTERNAL_SERVER_ERROR");
			throw new GeneralException("INTERNAL_SERVER_ERROR");
		}
		return country;
	}

	@Override
	public AfricanCountry searchByCapital(String capital) {
		AfricanCountry country = new AfricanCountry();
		country = repository.searchByCapital(capital);
		if(country==null) {
			throw new CountryNotFoundException("COUNTRY NOT FOUND");
		}
		return country;
	}

	@Override
	public AfricanCountry searchByCallingCode(String callingCode) {
		AfricanCountry country = new AfricanCountry();
		country = repository.searchByCallingCode(callingCode);
		if(country==null) {
			throw new CountryNotFoundException("COUNTRY NOT FOUND");
		}
		return country;
	}

	@Override
	public AfricanCountry searchByAlpha3Code(String alpha3Code) {
		AfricanCountry country = new AfricanCountry();
		country = repository.searchByAlpha3Code(alpha3Code);
		if(country==null) {
			throw new CountryNotFoundException("COUNTRY NOT FOUND");
		}
		return country;
	}

	@Override
	public List<AfricanCountry> searchBySubRegion(String subRegion) {
		
		List<AfricanCountry> countries = new ArrayList<AfricanCountry>();
		countries = repository.searchBySubRegion(subRegion);
		if(countries==null || countries.isEmpty()) {
			throw new CountryNotFoundException("NO COUNTRY HAS BEEN FOUND");
		}
		return countries;
	}

	@Override
	public List<AfricanCountry> searchByLanguage(String language) {
		
		List<AfricanCountry> countries = new ArrayList<AfricanCountry>();
		countries = repository.searchByLanguage(language);
		if(countries==null || countries.isEmpty()) {
			throw new CountryNotFoundException("NO COUNTRY HAS BEEN FOUND");
		}
		return countries;
	}
	
	@Override
	public List<AfricanCountry> getAllCountries(){
		
		return repository.findAll();
	}
}
