package com.examenT2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examenT2.model.ProveedorTito;
import com.examenT2.repository.ProveedorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProveedorService {
	  private final ProveedorRepository proveedorRepository;

	    public List<ProveedorTito> getAll() {
	        return proveedorRepository.findAll();
	    }
}
