package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Catalogo;

import java.util.Set;

public interface CatalogoService {
    Catalogo agregarCatalogo(Catalogo catalogo);
    Catalogo activarCatalogo(Catalogo catalogo);
    Set<Catalogo> obtenerCatalogos();
    Catalogo obtenerCatalogo(Long catalogoId);
    void eliminarCatalogo(Long catalogoId);
}
