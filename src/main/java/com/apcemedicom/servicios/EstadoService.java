package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Estado;

import java.util.Set;

public interface EstadoService {
    Estado agregarEstado(Estado estado);
    Estado activarEstado(Estado estado);
    Set<Estado> obtenerEstados();
    Estado obtenerEstado(Long estadoId);
    void eliminarEstado(Long estadoId);
}