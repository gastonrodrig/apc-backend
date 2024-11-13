package com.apcemedicom.repositorios;
import com.apcemedicom.modelo.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}
