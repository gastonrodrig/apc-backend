package com.apcemedicom.servicios.impl;

import com.apcemedicom.modelo.Proveedor;
import com.apcemedicom.repositorios.ProveedorRepository;
import com.apcemedicom.servicios.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ProveedorServiceImpl implements ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public Proveedor agregarProveedor(Proveedor proveedor){ return proveedorRepository.save(proveedor);}
    @Override
    public Proveedor activarProveedor(Proveedor proveedor){return proveedorRepository.save(proveedor);}
    @Override
    public Set<Proveedor> obtenerProveedores(){ return new LinkedHashSet<>(proveedorRepository.findAll());}
    @Override
    public Proveedor obtenerProveedor(Long proveedorId) { return proveedorRepository.findById(proveedorId).get();}
    @Override
    public void eliminarProveedor(Long proveedorId) {
        Proveedor proveedor = new Proveedor();
        proveedor.setProveedorId(proveedorId);
        proveedorRepository.delete(proveedor);
    }
}
