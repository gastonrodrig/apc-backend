package com.apcemedicom.controladores;

import com.apcemedicom.servicios.ProductoService;
import com.apcemedicom.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
@CrossOrigin("*")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @PostMapping("/")
    public ResponseEntity<Producto> agregarProducto(@RequestBody Producto producto){
        return ResponseEntity.ok(productoService.agregarProducto(producto));
    }
    @PutMapping("/")
    public ResponseEntity<Producto> activarProducto(@RequestBody Producto producto){
        return ResponseEntity.ok(productoService.activarProducto(producto));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarProductos(){
        return ResponseEntity.ok(productoService.obtenerProductos());
    }
    @GetMapping("/{productoId}")
    public Producto listarProducto(@PathVariable("productoId")Long productoId){
        return productoService.obtenerProducto(productoId);
    }
    @DeleteMapping("/{productoId}")
    public void eliminarProducto(@PathVariable("productoId") Long productoId){
        productoService.eliminarProducto(productoId);
    }
}
