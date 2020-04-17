# african-countries-REST-API


This API gives you the ability to search african countries by the following:

1. Search by name(partial name) it returns one country, eg: Rwanda is the country name: http://localhost:8083/africanCountries/rest/v1/name/ivory coast
2. Search by capital(the country capital) returns one country, eg: Yamoussoukro is Ivory Coast capital: http://localhost:8083/africanCountries/rest/v1/capital/Yamoussoukro 
3. Search by Calling Code it returns one country, eg: 225 is the calling call of Ivory Coast: http://localhost:8083/africanCountries/rest/v1/callingcode/225
4. Search by alpha3Code it returns one country, eg: CIV is Ivory Coast alpha3Code: http://localhost:8083/africanCountries/rest/v1/alpha3code/CIV
5. Search by subregion, it returns a list of countries: there are 5 sub rebregion in Africa: 
    a)Middle Africa
    b)Southern Africa
    c)Western Africa
    d)Northern Africa
    e)Eastern Africa
    eg: http://localhost:8083/africanCountries/rest/v1/subregion/Western Africa
 6. Search by language: it returns a list of countries, eg: http://localhost:8083/africanCountries/rest/v1/language/french
 
 N.B: The upper case and lower case doesn't matter in the parameter
