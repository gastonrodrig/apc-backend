package com.apcemedicom.servicios.impl;

import com.apcemedicom.repositorios.EstadoRepository;
import com.apcemedicom.modelo.Estado;
import com.apcemedicom.servicios.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class EstadoServiceImpl implements EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;
    @Override
    public Estado agregarEstado(Estado estado){
        return estadoRepository.save(estado);
    }
    @Override
    public Estado activarEstado(Estado estado){
        return estadoRepository.save(estado);
    }
    @Override
    public Set<Estado> obtenerEstados(){
        return new LinkedHashSet<>(estadoRepository.findAll());
    }

    @Override
    public Estado obtenerEstado(Long estadoId){
        return estadoRepository.findById(estadoId).get();
    }

    @Override
    public void eliminarEstado(Long estadoId){
        Estado estado = new Estado();
        estado.setEstadoId(estadoId);
        estadoRepository.delete(estado);
    }
}