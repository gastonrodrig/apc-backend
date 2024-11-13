package com.apcemedicom.controladores;

import com.apcemedicom.modelo.Catalogo;
import com.apcemedicom.servicios.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalogo")
@CrossOrigin("*")
public class CatalogoController {
    @Autowired
    private CatalogoService catalogoService;
    @PostMapping("/")
    public ResponseEntity<Catalogo> agregarCatalogo(@RequestBody Catalogo catalogo){
        return ResponseEntity.ok(catalogoService.agregarCatalogo(catalogo));
    }
    @PutMapping("/")
    public ResponseEntity<Catalogo> activarCatalogo(@RequestBody Catalogo catalogo){
        return ResponseEntity.ok(catalogoService.activarCatalogo(catalogo));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarCatalogos(){
        return ResponseEntity.ok(catalogoService.obtenerCatalogos());
    }
    @GetMapping("/{catalogoId}")
    public Catalogo listarCatalogo(@PathVariable("catalogoId")Long catalogoId){
        return catalogoService.obtenerCatalogo(catalogoId);
    }
    @DeleteMapping("/{catalogoId}")
    public void eliminarCatalogo(@PathVariable("catalogoId") Long catalogoId){
        catalogoService.eliminarCatalogo(catalogoId);
    }
}
