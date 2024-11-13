package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Producto;

import java.util.Set;

public interface ProductoService {
    Producto agregarProducto(Producto producto);
    Producto activarProducto(Producto producto);
    Set<Producto> obtenerProductos();
    Producto obtenerProducto(Long productoId);
    void eliminarProducto(Long productoId);
}
