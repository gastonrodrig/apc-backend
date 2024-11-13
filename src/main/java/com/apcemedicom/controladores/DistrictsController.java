package com.apcemedicom.controladores;

import com.apcemedicom.servicios.DistrictsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/districts")
@CrossOrigin("*")
public class DistrictsController {
    @Autowired
    private DistrictsService districtsService;
    @GetMapping("/")
    public ResponseEntity<?> listarDistricts(){
        return ResponseEntity.ok(districtsService.obtenerDistricts());
    }
}
