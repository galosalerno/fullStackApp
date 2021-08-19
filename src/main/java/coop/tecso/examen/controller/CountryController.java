package coop.tecso.examen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import coop.tecso.examen.dto.CountryDto;
import coop.tecso.examen.model.Country;
import coop.tecso.examen.repository.CountryRepository;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/country")

//se agrega una cabecera @CrossOrigin para poder consumir el servicio desde un cliente front end (React).

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}) 

public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;
	
	// Get All Countries
	@GetMapping("/findAll")
	public List<CountryDto> findAll() {
		
		List<CountryDto> result = new ArrayList<>();
		for (Country entity : countryRepository.findAll()) {
			CountryDto dto = new CountryDto();
			dto.setId(entity.getId());
			dto.setIsoCode(entity.getIsoCode());
			dto.setName(entity.getName());
			
			result.add(dto);
		}
		
	    return result;
	}
	@PostMapping("/new")
    public ResponseEntity<?> country(@RequestBody CountryDto country) {
    	
		CountryDto dto = new CountryDto();
		dto.setId(country.getId());
		dto.setIsoCode(country.getIsoCode());
		dto.setName(country.getName());
    
    	return new ResponseEntity<CountryDto>(dto, HttpStatus.OK);
    }
	
}
