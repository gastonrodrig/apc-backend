package com.apcemedicom.servicios.impl;

import com.apcemedicom.modelo.Provinces;
import com.apcemedicom.repositorios.ProvincesRepository;
import com.apcemedicom.servicios.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ProvincesServiceImpl implements ProvincesService {
    @Autowired
    private ProvincesRepository provincesRepository;
    @Override
    public Set<Provinces> obtenerProvinces(){ return new LinkedHashSet<>(provincesRepository.findAll());}

}
