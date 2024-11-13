package com.apcemedicom.servicios.impl;

import com.apcemedicom.modelo.OrdersDetails;
import com.apcemedicom.repositorios.OrdersDetailsRepository;
import com.apcemedicom.servicios.OrdersDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class OrdersDetailsServiceImpl implements OrdersDetailsService {
    @Autowired
    private OrdersDetailsRepository ordersDetailsRepository;

    @Override
    public OrdersDetails agregarOrdersDetail(OrdersDetails order){ return ordersDetailsRepository.save(order);}
    @Override
    public OrdersDetails activarOrdersDetail(OrdersDetails order){return ordersDetailsRepository.save(order);}
    @Override
    public Set<OrdersDetails> obtenerOrdersDetails(){ return new LinkedHashSet<>(ordersDetailsRepository.findAll());}
    @Override
    public OrdersDetails obtenerOrdersDetail(Long ordersdetailsId) { return ordersDetailsRepository.findById(ordersdetailsId).get();}
    @Override
    public void eliminarOrdersDetail(Long ordersdetailsId) {
        OrdersDetails ordersDetail = new OrdersDetails();
        ordersDetail.setOrdersdetailsId(ordersdetailsId);
        ordersDetailsRepository.delete(ordersDetail);
    }
    @Override
    public List<OrdersDetails> obtenerOrdersDetailsPorOrder(Long orderId) {
        return ordersDetailsRepository.findByOrderOrderId(orderId);
    }
}
