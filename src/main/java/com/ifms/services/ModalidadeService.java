package com.ifms.services;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifms.dto.ModalidadeDTO;
import com.ifms.entities.Modalidade;
import com.ifms.repositories.ModalidadeRepository;

@Service
public class ModalidadeService {

	private ModalidadeRepository repository;

	@Transactional(readOnly = true)
	public List<ModalidadeDTO> findAll() {
		List<Modalidade> list = repository.findAll();
		return list.stream().map(modalidade -> new ModalidadeDTO(modalidade))
				.collect(Collectors.toList());
	}
	@Transactional(readOnly = true)
	public ModalidadeDTO findById(Long id) {
		
		return null;
	}
	
}
