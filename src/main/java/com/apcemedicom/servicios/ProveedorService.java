package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Proveedor;

import java.util.Set;

public interface ProveedorService {
    Proveedor agregarProveedor(Proveedor proveedor);
    Proveedor activarProveedor(Proveedor proveedor);
    Set<Proveedor> obtenerProveedores();
    Proveedor obtenerProveedor(Long proveedorId);
    void eliminarProveedor(Long proveedorId);
}
