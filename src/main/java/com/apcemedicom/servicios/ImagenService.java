package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Imagen;

import java.util.Set;

public interface ImagenService {
    Imagen agregarImagen(Imagen imagen);
    Imagen activarImagen(Imagen imagen);
    Set<Imagen> obtenerImagenes();
    Imagen obtenerImagen(Long imagenId);
    void eliminarImagen(Long imagenId);
}
