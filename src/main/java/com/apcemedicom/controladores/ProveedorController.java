package com.apcemedicom.controladores;

import com.apcemedicom.servicios.ProveedorService;
import com.apcemedicom.modelo.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proveedores")
@CrossOrigin("*")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;
    @PostMapping("/")
    public ResponseEntity<Proveedor> agregarProveedor(@RequestBody Proveedor proveedor){
        return ResponseEntity.ok(proveedorService.agregarProveedor(proveedor));
    }
    @PutMapping("/")
    public ResponseEntity<Proveedor> activarProveedor(@RequestBody Proveedor proveedor){
        return ResponseEntity.ok(proveedorService.activarProveedor(proveedor));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarProveedores(){
        return ResponseEntity.ok(proveedorService.obtenerProveedores());
    }
    @GetMapping("/{proveedorId}")
    public Proveedor listarProveedor(@PathVariable("proveedorId")Long proveedorId){
        return proveedorService.obtenerProveedor(proveedorId);
    }
    @DeleteMapping("/{proveedorId}")
    public void eliminarProveedor(@PathVariable("proveedorId") Long proveedorId){
        proveedorService.eliminarProveedor(proveedorId);
    }
}
