package com.fantania.africanCountriesAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fantania.africanCountriesAPI.model.AfricanCountry;

@Repository
public interface AfricanCountryRepository extends JpaRepository<AfricanCountry,Long>{
	
	@Query(value = "SELECT * FROM country c WHERE c.name = :name", nativeQuery = true)
    public AfricanCountry searchByName(@Param("name") String name);
	
	@Query(value = "SELECT * FROM country c WHERE c.capital = :capital", nativeQuery = true)
    public AfricanCountry searchByCapital(@Param("capital") String capital);
	
	@Query(value = "SELECT * FROM country c WHERE c.calling_code = :calling_code", nativeQuery = true)
    public AfricanCountry searchByCallingCode(@Param("calling_code") String callingCode);
	
	@Query(value = "SELECT * FROM country c WHERE c.alpha3Code = :alpha3Code", nativeQuery = true)
    public AfricanCountry searchByAlpha3Code(@Param("alpha3Code") String alpha3Code);
	
	@Query(value = "SELECT * FROM country c WHERE c.sub_region = :sub_region", nativeQuery = true)
    public List<AfricanCountry> searchBySubRegion(@Param("sub_region") String subRegion);
	
	@Query(value = "SELECT * FROM country c WHERE c.languages LIKE %:language%", nativeQuery = true)
    public List<AfricanCountry> searchByLanguage(@Param("language") String language);
	
	

}
