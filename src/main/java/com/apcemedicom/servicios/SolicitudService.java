package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Solicitud;
import java.util.List;
import java.util.Set;

public interface SolicitudService {
    Solicitud agregarSolicitud(Solicitud solicitud);
    Solicitud activarSolicitud(Solicitud solicitud);
    Set<Solicitud> obtenerSolicitudes();
    Solicitud obtenerSolicitud(Long solicitudId);
    void eliminarSolicitud(Long solicitudId);
    List<Solicitud> obtenerSolicitudesPorUsuario(Long id);
}
