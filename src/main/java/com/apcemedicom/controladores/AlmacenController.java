package com.apcemedicom.controladores;

import com.apcemedicom.modelo.Almacen;
import com.apcemedicom.servicios.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/almacenes")
@CrossOrigin("*")
public class AlmacenController {
    @Autowired
    private AlmacenService almacenService;
    @PostMapping("/")
    public ResponseEntity<Almacen> agregarAlmacen(@RequestBody Almacen almacen){
        return ResponseEntity.ok(almacenService.agregarAlmacen(almacen));
    }
    @PutMapping("/")
    public ResponseEntity<Almacen> activarAlmacen(@RequestBody Almacen almacen){
        return ResponseEntity.ok(almacenService.activarAlmacen(almacen));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarAlmacenes(){
        return ResponseEntity.ok(almacenService.obtenerAlmacenes());
    }
    @GetMapping("/{almacenId}")
    public Almacen listarAlmacen(@PathVariable("almacenId")Long almacenId){
        return almacenService.obtenerAlmacen(almacenId);
    }
    @DeleteMapping("/{almacenId}")
    public void eliminarAlmacen(@PathVariable("almacenId") Long almacenId){
        almacenService.eliminarAlmacen(almacenId);
    }
}
