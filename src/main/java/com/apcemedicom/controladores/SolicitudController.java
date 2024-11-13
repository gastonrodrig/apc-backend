package com.apcemedicom.controladores;

import com.apcemedicom.servicios.SolicitudService;
import com.apcemedicom.modelo.Solicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/solicitud")
@CrossOrigin("*")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;
    @PostMapping("/")
    public ResponseEntity<Solicitud> agregarSolicitud(@RequestBody Solicitud solicitud){
        return ResponseEntity.ok(solicitudService.agregarSolicitud(solicitud));
    }
    @PutMapping("/")
    public ResponseEntity<Solicitud> activarSolicitud(@RequestBody Solicitud solicitud){
        return ResponseEntity.ok(solicitudService.activarSolicitud(solicitud));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarSolicitudes(){
        return ResponseEntity.ok(solicitudService.obtenerSolicitudes());
    }
    @GetMapping("/{solicitudId}")
    public Solicitud listarSolicitud(@PathVariable("solicitudId")Long solicitudId){
        return solicitudService.obtenerSolicitud(solicitudId);
    }
    @DeleteMapping("/{solicitudId}")
    public void eliminarSolicitud(@PathVariable("solicitudId") Long solicitudId){
        solicitudService.eliminarSolicitud(solicitudId);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<List<Solicitud>> listarSolicitudesPorUsuario(@PathVariable("id") Long id) {
        List<Solicitud> solicitud = solicitudService.obtenerSolicitudesPorUsuario(id);
        return ResponseEntity.ok(solicitud);
    }
}
