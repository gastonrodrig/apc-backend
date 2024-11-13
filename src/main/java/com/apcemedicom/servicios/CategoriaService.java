package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Categoria;

import java.util.Set;

public interface CategoriaService {
    Categoria agregarCategoria(Categoria categoria);
    Categoria activarCategoria(Categoria categoria);
    Set<Categoria> obtenerCategorias();
    Categoria obtenerCategoria(Long categoriaId);
    void eliminarCategoria(Long categoriaId);
}
