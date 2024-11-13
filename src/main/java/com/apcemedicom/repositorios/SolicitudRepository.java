package com.apcemedicom.repositorios;
import com.apcemedicom.modelo.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
    List<Solicitud> findByUserId(Long userId);
}
