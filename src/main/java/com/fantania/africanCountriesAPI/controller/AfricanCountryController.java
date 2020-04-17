package com.fantania.africanCountriesAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fantania.africanCountriesAPI.model.AfricanCountry;
import com.fantania.africanCountriesAPI.service.AfricanCountryService;

@RestController
@RequestMapping("/africanCountries/rest/v1")
public class AfricanCountryController {
	
	AfricanCountry country;
	List<AfricanCountry> countries;
	
	@Autowired
	public AfricanCountryService africanCountryService;
	
	 @GetMapping("/all")
	    public ResponseEntity<List<AfricanCountry>> getAllCountries(){
			
			countries = africanCountryService.getAllCountries();
				
	        return new ResponseEntity<List<AfricanCountry>>(countries, HttpStatus.OK);
	    }
	
	@GetMapping("/name/{name}")
    public ResponseEntity<AfricanCountry> searchByName(@PathVariable String name){
		
		country = africanCountryService.searchByName(name);
			
        return new ResponseEntity<AfricanCountry>(country, HttpStatus.OK);
    }
	
	@GetMapping("/capital/{capital}")
    public ResponseEntity<AfricanCountry> searchByCapital(@PathVariable String capital){
		
		country = africanCountryService.searchByCapital(capital);
			
        return new ResponseEntity<AfricanCountry>(country, HttpStatus.OK);
    }
	
	@GetMapping("/callingcode/{callingcode}")
    public ResponseEntity<AfricanCountry> searchByCallingCode(@PathVariable String callingcode){
		
		country = africanCountryService.searchByCallingCode(callingcode);
			
        return new ResponseEntity<AfricanCountry>(country, HttpStatus.OK);
    }
    
    @GetMapping("/alpha3code/{alpha3code}")
    public ResponseEntity<AfricanCountry> searchByAlpha3Code(@PathVariable String alpha3code){
		
		country = africanCountryService.searchByAlpha3Code(alpha3code);
			
        return new ResponseEntity<AfricanCountry>(country, HttpStatus.OK);
    }
    
    @GetMapping("/subregion/{subregion}")
    public ResponseEntity<List<AfricanCountry>> searchBySubRegion(@PathVariable String subregion){
		
		countries = africanCountryService.searchBySubRegion(subregion);
			
        return new ResponseEntity<List<AfricanCountry>>(countries, HttpStatus.OK);
    }
    
    @GetMapping("/language/{language}")
    public ResponseEntity<List<AfricanCountry>> searchByLanguage(@PathVariable String language){
		
		countries = africanCountryService.searchByLanguage(language);
			
        return new ResponseEntity<List<AfricanCountry>>(countries, HttpStatus.OK);
    }

}
