package com.ifms.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifms.dto.ModalidadeDTO;
import com.ifms.entities.Modalidade;
import com.ifms.repositories.ModalidadeRepository;
import com.ifms.services.exceptions.ResourceNotFoundException;

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
		Optional<Modalidade> obj = repository.findById(id);
		Modalidade modalidade = obj.orElseThrow(() -> new ResourceNotFoundException(
				"a modalidade solicitada não foi localizada"));
		return new ModalidadeDTO(modalidade);
	}
	
}
