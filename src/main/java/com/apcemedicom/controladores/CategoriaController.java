package com.apcemedicom.controladores;

import com.apcemedicom.modelo.Categoria;
import com.apcemedicom.servicios.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @PostMapping("/")
    public ResponseEntity<Categoria> agregarCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.agregarCategoria(categoria));
    }
    @PutMapping("/")
    public ResponseEntity<Categoria> activarCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.activarCategoria(categoria));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarCategorias(){
        return ResponseEntity.ok(categoriaService.obtenerCategorias());
    }
    @GetMapping("/{categoriaId}")
    public Categoria listarCategoria(@PathVariable("categoriaId")Long categoriaId){
        return categoriaService.obtenerCategoria(categoriaId);
    }
    @DeleteMapping("/{categoriaId}")
    public void eliminarCategoria(@PathVariable("categoriaId") Long categoriaId){
        categoriaService.eliminarCategoria(categoriaId);
    }
}
