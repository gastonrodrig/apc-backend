package com.apcemedicom.controladores;

import com.apcemedicom.servicios.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@CrossOrigin("*")
public class DepartmentsController {
    @Autowired
    private DepartmentsService departmentsService;
    @GetMapping("/")
    public ResponseEntity<?> listarDepartments(){
        return ResponseEntity.ok(departmentsService.obtenerDepartments());
    }
}
