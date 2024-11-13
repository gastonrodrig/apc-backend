package com.apcemedicom.repositorios;
import com.apcemedicom.modelo.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ImagenRepository extends JpaRepository<Imagen, Long> {
}
