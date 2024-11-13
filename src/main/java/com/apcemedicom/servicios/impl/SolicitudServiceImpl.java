package com.apcemedicom.servicios.impl;

import com.apcemedicom.modelo.Solicitud;
import com.apcemedicom.repositorios.SolicitudRepository;
import com.apcemedicom.servicios.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

@Service
public class SolicitudServiceImpl implements SolicitudService {
    @Autowired
    private SolicitudRepository solicitudRepository;
    @Override
    public Solicitud agregarSolicitud(Solicitud solicitud){ return solicitudRepository.save(solicitud);}
    @Override
    public Solicitud activarSolicitud(Solicitud solicitud){return solicitudRepository.save(solicitud);}
    @Override
    public Set<Solicitud> obtenerSolicitudes(){ return new LinkedHashSet<>(solicitudRepository.findAll());}
    @Override
    public Solicitud obtenerSolicitud(Long solicitudId) { return solicitudRepository.findById(solicitudId).get();}
    @Override
    public void eliminarSolicitud(Long solicitudId) {
        Solicitud solicitud = new Solicitud();
        solicitud.setSolicitudId(solicitudId);
        solicitudRepository.delete(solicitud);
    }
    @Override
    public List<Solicitud> obtenerSolicitudesPorUsuario(Long id) {
        return solicitudRepository.findByUserId(id);
    }
}
