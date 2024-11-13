package com.apcemedicom.repositorios;
import com.apcemedicom.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
