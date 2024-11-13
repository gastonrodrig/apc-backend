package com.apcemedicom.servicios.impl;

import com.apcemedicom.repositorios.ImagenRepository;
import com.apcemedicom.modelo.Imagen;
import com.apcemedicom.servicios.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ImagenServiceImpl implements ImagenService {
    @Autowired
    private ImagenRepository imagenRepository;

    @Override
    public Imagen agregarImagen(Imagen imagen){ return imagenRepository.save(imagen);}
    @Override
    public Imagen activarImagen(Imagen imagen){return imagenRepository.save(imagen);}
    @Override
    public Set<Imagen> obtenerImagenes(){ return new LinkedHashSet<>(imagenRepository.findAll());}
    @Override
    public Imagen obtenerImagen(Long imagenId) { return imagenRepository.findById(imagenId).get();}
    @Override
    public void eliminarImagen(Long imagenId) {
        Imagen imagen = new Imagen();
        imagen.setImagenId(imagenId);
        imagenRepository.delete(imagen);
    }
}
