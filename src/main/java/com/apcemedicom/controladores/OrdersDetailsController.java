package com.apcemedicom.controladores;

import com.apcemedicom.servicios.OrdersDetailsService;
import com.apcemedicom.modelo.OrdersDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordersdetails")
@CrossOrigin("*")
public class OrdersDetailsController {
    @Autowired
    private OrdersDetailsService ordersDetailsService;
    @PostMapping("/")
    public ResponseEntity<OrdersDetails> agregarOrdersDetail(@RequestBody OrdersDetails orderDetail){
        return ResponseEntity.ok(ordersDetailsService.agregarOrdersDetail(orderDetail));
    }
    @PutMapping("/")
    public ResponseEntity<OrdersDetails> activarOrdersDetail(@RequestBody OrdersDetails orderDetail){
        return ResponseEntity.ok(ordersDetailsService.activarOrdersDetail(orderDetail));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarOrdersDetails(){
        return ResponseEntity.ok(ordersDetailsService.obtenerOrdersDetails());
    }
    @GetMapping("/{ordersdetailsId}")
    public OrdersDetails listarOrdersDetail(@PathVariable("ordersdetailsId")Long ordersdetailsId){
        return ordersDetailsService.obtenerOrdersDetail(ordersdetailsId);
    }
    @DeleteMapping("/{ordersdetailsId}")
    public void eliminarOrdersDetail(@PathVariable("ordersdetailsId") Long ordersdetailsId){
        ordersDetailsService.eliminarOrdersDetail(ordersdetailsId);
    }
    @GetMapping("/order/{orderId}")
    public ResponseEntity<List<OrdersDetails>> listarOrdersDetailsPorOrder(@PathVariable("orderId") Long orderId) {
        List<OrdersDetails> ordersDetails = ordersDetailsService.obtenerOrdersDetailsPorOrder(orderId);
        return ResponseEntity.ok(ordersDetails);
    }
}
