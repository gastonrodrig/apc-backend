package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Servicio;

import java.util.Set;

public interface ServicioService {
    Servicio agregarServicio(Servicio servicio);
    Servicio actualizarServicio(Servicio servicio);
    Set<Servicio> obtenerServicios();
    Servicio obtenerServicio(Long servicioId);
    void eliminarServicio(Long servicioId);
}
