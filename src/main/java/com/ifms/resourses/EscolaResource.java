package com.ifms.resourses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.entities.Escola;

@RestController
@RequestMapping (value = "/escolas")
public class EscolaResource {

	public ResponseEntity<List<Escola>> findAll(){
		List<Escola> lista = new ArrayList<>();
		lista.add(new Escola(1L, "Eurico", "Rua itauba", "eurico.com","eurico@gmail.com", "Robson","9999999"));
		return ResponseEntity.ok().body(lista);
	}
}
