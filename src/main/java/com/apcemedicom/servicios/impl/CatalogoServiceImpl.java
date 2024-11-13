package com.apcemedicom.servicios.impl;

import com.apcemedicom.modelo.Catalogo;
import com.apcemedicom.repositorios.CatalogoRepository;
import com.apcemedicom.servicios.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CatalogoServiceImpl implements CatalogoService {
    @Autowired
    private CatalogoRepository catalogoRepository;

    @Override
    public Catalogo agregarCatalogo(Catalogo catalogo){ return catalogoRepository.save(catalogo);}
    @Override
    public Catalogo activarCatalogo(Catalogo catalogo){return catalogoRepository.save(catalogo);}
    @Override
    public Set<Catalogo> obtenerCatalogos(){ return new LinkedHashSet<>(catalogoRepository.findAll());}
    @Override
    public Catalogo obtenerCatalogo(Long catalogoId) { return catalogoRepository.findById(catalogoId).get();}
    @Override
    public void eliminarCatalogo(Long catalogoId) {
        Catalogo catalogo = new Catalogo();
        catalogo.setCatalogoId(catalogoId);
        catalogoRepository.delete(catalogo);
    }
}
