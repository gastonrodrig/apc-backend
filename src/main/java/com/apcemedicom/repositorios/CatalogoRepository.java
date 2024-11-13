package com.apcemedicom.repositorios;
import com.apcemedicom.modelo.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {
}
