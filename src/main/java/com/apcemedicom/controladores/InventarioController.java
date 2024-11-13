package com.apcemedicom.controladores;

import com.apcemedicom.modelo.Inventario;
import com.apcemedicom.servicios.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventario")
@CrossOrigin("*")
public class InventarioController {
    @Autowired
    private InventarioService inventarioService;
    @PostMapping("/")
    public ResponseEntity<Inventario> agregarInventario(@RequestBody Inventario inventario){
        return ResponseEntity.ok(inventarioService.agregarInventario(inventario));
    }
    @PutMapping("/")
    public ResponseEntity<Inventario> activarInventario(@RequestBody Inventario inventario){
        return ResponseEntity.ok(inventarioService.activarInventario(inventario));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarInventarios(){
        return ResponseEntity.ok(inventarioService.obtenerInventarios());
    }
    @GetMapping("/{inventarioId}")
    public Inventario listarInventario(@PathVariable("inventarioId")Long inventarioId){
        return inventarioService.obtenerInventario(inventarioId);
    }
    @DeleteMapping("/{inventarioId}")
    public void eliminarInventario(@PathVariable("inventarioId") Long inventarioId){
        inventarioService.eliminarInventario(inventarioId);
    }
}
