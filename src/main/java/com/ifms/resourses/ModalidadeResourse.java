package com.ifms.resourses;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.dto.ModalidadeDTO;
import com.ifms.services.ModalidadeService;

@RestController
@RequestMapping(value = "/modalidades")
public class ModalidadeResourse {
	
	@Autowired
	private ModalidadeService service;

	@GetMapping
	public ResponseEntity<List<ModalidadeDTO>> findAll(){
		List<ModalidadeDTO> lista = service.findAll();
		 return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/")
	public ResponseEntity<ModalidadeDTO> findById(@PathVariable Long id){
		ModalidadeDTO dto = service.findById(id);
		 return ResponseEntity.ok().body(dto);
	}
}  
