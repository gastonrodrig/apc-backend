package com.apcemedicom.controladores;

import com.apcemedicom.modelo.Imagen;
import com.apcemedicom.servicios.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imagenes")
@CrossOrigin("*")
public class ImagenController {
    @Autowired
    private ImagenService imagenService;
    @PostMapping("/")
    public ResponseEntity<Imagen> agregarProducto(@RequestBody Imagen imagen){
        return ResponseEntity.ok(imagenService.agregarImagen(imagen));
    }
    @PutMapping("/")
    public ResponseEntity<Imagen> activarImagen(@RequestBody Imagen imagen){
        return ResponseEntity.ok(imagenService.activarImagen(imagen));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarImagenes(){
        return ResponseEntity.ok(imagenService.obtenerImagenes());
    }
    @GetMapping("/{imagenId}")
    public Imagen listarImagen(@PathVariable("imagenId")Long imagenId){
        return imagenService.obtenerImagen(imagenId);
    }
    @DeleteMapping("/{imagenId}")
    public void eliminarImagen(@PathVariable("imagenId") Long imagenId){
        imagenService.eliminarImagen(imagenId);
    }
}
