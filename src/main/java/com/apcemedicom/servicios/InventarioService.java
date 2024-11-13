package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Inventario;

import java.util.Set;

public interface InventarioService {
    Inventario agregarInventario(Inventario inventario);
    Inventario activarInventario(Inventario inventario);
    Set<Inventario> obtenerInventarios();
    Inventario obtenerInventario(Long inventarioId);
    void eliminarInventario(Long inventarioId);
}
