package com.ifms.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.dto.EscolaDTO;
import com.ifms.services.EscolaService;

@RestController
@RequestMapping (value = "/escolas")
public class EscolaResource {

	@Autowired
	private EscolaService service;
	
	@GetMapping
	public ResponseEntity<List<EscolaDTO>> findAll(){
		List<EscolaDTO> lista = service.finAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EscolaDTO> findById(@PathVariable Long id){
		EscolaDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
