package coop.tecso.examen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import coop.tecso.examen.dto.PersonaFisicaDto;
import coop.tecso.examen.model.Persona;
import coop.tecso.examen.model.PersonaFisica;
import coop.tecso.examen.repository.TitularRepository;

@RestController
@RequestMapping("/titular/fisico")
public class PersonaFisicaController {

	@Autowired
	private TitularRepository titularRepository;
	
	// Get All Titulars
	@GetMapping("/findAll")
	public List<PersonaFisicaDto> findAll() {
		
		List<PersonaFisicaDto> listaTitulares = new ArrayList<>();
		for (Persona entity : titularRepository.findAll()) {
			PersonaFisicaDto dto = new PersonaFisicaDto();
			dto.setName(((PersonaFisica) entity).getName());
			dto.setLastName(((PersonaFisica) entity).getLastName());
			dto.setRut(entity.getRut());
			listaTitulares.add(dto);
		}
	    return listaTitulares;
	}
	
	
	@PostMapping("/new")
    public ResponseEntity<?> titular(@RequestBody PersonaFisicaDto titular) {
    	
		PersonaFisicaDto response = new PersonaFisicaDto();
    	response.setName(titular.getName());
    	response.setLastName(titular.getLastName());
    	response.setRut(titular.getRut());
    
    	return new ResponseEntity<PersonaFisicaDto>(response, HttpStatus.OK);
    }
}
