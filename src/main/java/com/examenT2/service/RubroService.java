package com.examenT2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examenT2.model.RubroTito;
import com.examenT2.repository.RubroRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RubroService {
	
	private final RubroRepository rubroRepository;

    public List<RubroTito> getAll() {
        return rubroRepository.findAll();
    }
}
