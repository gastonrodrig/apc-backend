package com.apcemedicom.servicios.impl;

import com.apcemedicom.repositorios.DistrictsRepository;
import com.apcemedicom.modelo.Districts;
import com.apcemedicom.servicios.DistrictsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class DistrictsServiceImpl implements DistrictsService {
    @Autowired
    private DistrictsRepository districtsRepository;
    @Override
    public Set<Districts> obtenerDistricts(){ return new LinkedHashSet<>(districtsRepository.findAll());}

}
