package com.apcemedicom.repositorios;
import com.apcemedicom.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
