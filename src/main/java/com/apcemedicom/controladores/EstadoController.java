package com.apcemedicom.controladores;

import com.apcemedicom.modelo.Estado;
import com.apcemedicom.servicios.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estado")
@CrossOrigin("*")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;

    @PostMapping("/")
    public ResponseEntity<Estado> guardarEstado(@RequestBody Estado estado){
        return ResponseEntity.ok(estadoService.agregarEstado(estado));
    }

    @PutMapping("/")
    public ResponseEntity<Estado> actualizarEstado(@RequestBody Estado estado){
        return ResponseEntity.ok(estadoService.activarEstado(estado));
    }

    @GetMapping("/")
    public ResponseEntity<?> listarEstados(){
        return ResponseEntity.ok(estadoService.obtenerEstados());
    }
    @GetMapping("/{estadoId}")
    public Estado listarEstado(@PathVariable("estadoId")Long estadoId){
        return estadoService.obtenerEstado(estadoId);
    }
    @DeleteMapping("/{estadoId}")
    public void eliminarEstado(@PathVariable("estadoId") Long estadoId){
        estadoService.eliminarEstado((estadoId));
    }
}