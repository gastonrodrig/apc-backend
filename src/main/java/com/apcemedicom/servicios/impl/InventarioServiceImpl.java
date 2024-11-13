package com.apcemedicom.servicios.impl;

import com.apcemedicom.repositorios.InventarioRepository;
import com.apcemedicom.modelo.Inventario;
import com.apcemedicom.servicios.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class InventarioServiceImpl implements InventarioService {
    @Autowired
    private InventarioRepository inventarioRepository;

    @Override
    public Inventario agregarInventario(Inventario inventario){ return inventarioRepository.save(inventario);}
    @Override
    public Inventario activarInventario(Inventario inventario){return inventarioRepository.save(inventario);}
    @Override
    public Set<Inventario> obtenerInventarios(){ return new LinkedHashSet<>(inventarioRepository.findAll());}
    @Override
    public Inventario obtenerInventario(Long inventarioId) { return inventarioRepository.findById(inventarioId).get();}
    @Override
    public void eliminarInventario(Long inventarioId) {
        Inventario inventario = new Inventario();
        inventario.setInventarioId(inventarioId);
        inventarioRepository.delete(inventario);
    }
}
