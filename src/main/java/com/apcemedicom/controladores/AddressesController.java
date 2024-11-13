package com.apcemedicom.controladores;

import com.apcemedicom.modelo.Addresses;
import com.apcemedicom.servicios.AddressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/addresses")
@CrossOrigin("*")
public class AddressesController {
    @Autowired
    private AddressesService addressesService;
    @PostMapping("/")
    public ResponseEntity<Addresses> agregarAddress(@RequestBody Addresses address){
        return ResponseEntity.ok(addressesService.agregarAddress(address));
    }
    @PutMapping("/")
    public ResponseEntity<Addresses> activarAddress(@RequestBody Addresses address){
        return ResponseEntity.ok(addressesService.activarAddress(address));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarAddresses(){
        return ResponseEntity.ok(addressesService.obtenerAddresses());
    }
    @GetMapping("/{addressId}")
    public Addresses listarAddress(@PathVariable("addressId")Long addressId){
        return addressesService.obtenerAddress(addressId);
    }
    @DeleteMapping("/{addressId}")
    public void eliminarAddress(@PathVariable("addressId") Long addressId){
        addressesService.eliminarAddress(addressId);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<List<Addresses>> listarAddressesPorUsuario(@PathVariable("id") Long id) {
        List<Addresses> orders = addressesService.obtenerAddressesPorUsuario(id);
        return ResponseEntity.ok(orders);
    }
}
