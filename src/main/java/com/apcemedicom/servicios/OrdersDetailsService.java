package com.apcemedicom.servicios;

import com.apcemedicom.modelo.OrdersDetails;

import java.util.List;
import java.util.Set;

public interface OrdersDetailsService {
    OrdersDetails agregarOrdersDetail(OrdersDetails orderDetail);
    OrdersDetails activarOrdersDetail(OrdersDetails orderDetail);
    Set<OrdersDetails> obtenerOrdersDetails();
    OrdersDetails obtenerOrdersDetail(Long ordersdetailsId);
    void eliminarOrdersDetail(Long ordersdetailsId);
    List<OrdersDetails> obtenerOrdersDetailsPorOrder(Long orderId);

}
