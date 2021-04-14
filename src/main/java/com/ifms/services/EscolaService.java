package com.ifms.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifms.dto.EscolaDTO;
import com.ifms.entities.Escola;
import com.ifms.repositories.EscolaRepository;

@Service
public class EscolaService {
	
	@Autowired
	private  EscolaRepository repository;

	@Transactional(readOnly = true)
	public List<EscolaDTO> finAll() {
		List<Escola> list = repository.findAll();
		return list.stream().map(escola -> new EscolaDTO(escola))
				.collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public EscolaDTO findById(Long id) {
		Optional<Escola> obj = repository.findById(id);
		Escola escola = obj.get();
		return new EscolaDTO();
	}
}
