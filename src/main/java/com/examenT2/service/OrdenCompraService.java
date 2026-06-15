package com.examenT2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examenT2.dto.ResultadoResponse;
import com.examenT2.model.OrdenCompraTito;
import com.examenT2.repository.OrdenCompraRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrdenCompraService {
	private final OrdenCompraRepository ordenCompraRepository;

    public List<OrdenCompraTito> getAll() {
        return ordenCompraRepository.findAllByOrderByNroOrdenDesc();
    }

    public OrdenCompraTito getOne(Integer nroOrden) {
        return ordenCompraRepository.findById(nroOrden).orElseThrow();
    }

    public ResultadoResponse create(OrdenCompraTito ordenCompra) {
        try {
            var registro = ordenCompraRepository.save(ordenCompra);
            var mensaje = String.format("Orden de compra Nro. %s registrada.", registro.getNroOrden());
            return new ResultadoResponse(true, mensaje);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultadoResponse(false, "Hubo un error en la transacción");
        }
    }

    public ResultadoResponse update(OrdenCompraTito ordenCompra) {
        try {
            var registro = ordenCompraRepository.save(ordenCompra);
            var mensaje = String.format("Orden de compra Nro. %s actualizada.", registro.getNroOrden());
            return new ResultadoResponse(true, mensaje);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultadoResponse(false, "Hubo un error en la transacción");
        }
    }
}
