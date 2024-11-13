package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Almacen;

import java.util.Set;

public interface AlmacenService {
    Almacen agregarAlmacen(Almacen almacen);
    Almacen activarAlmacen(Almacen almacen);
    Set<Almacen> obtenerAlmacenes();
    Almacen obtenerAlmacen(Long almacenId);
    void eliminarAlmacen(Long almacenId);
}
