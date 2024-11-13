package com.apcemedicom.controladores;

import com.apcemedicom.modelo.Servicio;
import com.apcemedicom.servicios.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicios")
@CrossOrigin("*")
public class ServicioController {
    @Autowired
    private ServicioService servicioService;
    @PostMapping("/")
    public ResponseEntity<Servicio> agregarServicio(@RequestBody Servicio servicio){
        return ResponseEntity.ok(servicioService.agregarServicio(servicio));
    }
    @PutMapping("/")
    public ResponseEntity<Servicio> actualizarServicio(@RequestBody Servicio servicio){
        return ResponseEntity.ok(servicioService.actualizarServicio(servicio));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarServicios(){
        return ResponseEntity.ok(servicioService.obtenerServicios());
    }
    @GetMapping("/{servicioId}")
    public Servicio listarServicio(@PathVariable("servicioId")Long servicioId){
        return servicioService.obtenerServicio(servicioId);
    }
    @DeleteMapping("/{servicioId}")
    public void eliminarServicio(@PathVariable("servicioId") Long servicioId){
        servicioService.eliminarServicio(servicioId);
    }
}
