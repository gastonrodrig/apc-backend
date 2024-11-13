package com.apcemedicom.repositorios;
import com.apcemedicom.modelo.OrdersDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrdersDetailsRepository extends JpaRepository<OrdersDetails, Long> {
    List<OrdersDetails> findByOrderOrderId(Long orderId);

}
