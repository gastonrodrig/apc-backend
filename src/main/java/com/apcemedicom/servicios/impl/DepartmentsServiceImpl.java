package com.apcemedicom.servicios.impl;

import com.apcemedicom.repositorios.DepartmentsRepository;
import com.apcemedicom.modelo.Departments;
import com.apcemedicom.servicios.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {
    @Autowired
    private DepartmentsRepository departmentsRepository;
    @Override
    public Set<Departments> obtenerDepartments(){ return new LinkedHashSet<>(departmentsRepository.findAll());}

}
