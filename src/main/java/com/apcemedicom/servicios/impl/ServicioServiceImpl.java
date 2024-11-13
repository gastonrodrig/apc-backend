package com.apcemedicom.servicios.impl;

import com.apcemedicom.modelo.Servicio;
import com.apcemedicom.repositorios.ServicioRepository;
import com.apcemedicom.servicios.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ServicioServiceImpl implements ServicioService {
    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public Servicio agregarServicio(Servicio servicio){ return servicioRepository.save(servicio);}
    @Override
    public Servicio actualizarServicio(Servicio servicio){return servicioRepository.save(servicio);}
    @Override
    public Set<Servicio> obtenerServicios(){ return new LinkedHashSet<>(servicioRepository.findAll());}
    @Override
    public Servicio obtenerServicio(Long servicioId) { return servicioRepository.findById(servicioId).get();}
    @Override
    public void eliminarServicio(Long servicioId) {
        Servicio servicio = new Servicio();
        servicio.setServicioId(servicioId);
        servicioRepository.delete(servicio);
    }
}
