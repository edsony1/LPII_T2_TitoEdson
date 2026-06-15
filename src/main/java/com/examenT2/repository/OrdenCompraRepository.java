package com.examenT2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examenT2.model.OrdenCompraTito;

public interface OrdenCompraRepository extends JpaRepository<OrdenCompraTito, Integer> {
    List<OrdenCompraTito> findAllByOrderByNroOrdenDesc();

}
