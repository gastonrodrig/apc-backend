package com.apcemedicom.servicios.impl;

import com.apcemedicom.repositorios.AlmacenRepository;
import com.apcemedicom.modelo.Almacen;
import com.apcemedicom.servicios.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class AlmacenServiceImpl implements AlmacenService {
    @Autowired
    private AlmacenRepository almacenRepository;
    @Override
    public Almacen agregarAlmacen(Almacen almacen){ return almacenRepository.save(almacen);}
    @Override
    public Almacen activarAlmacen(Almacen almacen){return almacenRepository.save(almacen);}
    @Override
    public Set<Almacen> obtenerAlmacenes(){ return new LinkedHashSet<>(almacenRepository.findAll());}
    @Override
    public Almacen obtenerAlmacen(Long almacenId) { return almacenRepository.findById(almacenId).get();}
    @Override
    public void eliminarAlmacen(Long almacenId) {
        Almacen almacen = new Almacen();
        almacen.setAlmacenId(almacenId);
        almacenRepository.delete(almacen);
    }
}
