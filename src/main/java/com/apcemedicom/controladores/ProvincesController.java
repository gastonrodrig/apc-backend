package com.apcemedicom.controladores;

import com.apcemedicom.servicios.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provinces")
@CrossOrigin("*")
public class ProvincesController {
    @Autowired
    private ProvincesService provincesService;
    @GetMapping("/")
    public ResponseEntity<?> listarProvinces(){
        return ResponseEntity.ok(provincesService.obtenerProvinces());
    }
}
