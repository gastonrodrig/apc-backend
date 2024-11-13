package com.apcemedicom.repositorios;

import com.apcemedicom.modelo.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Departments, String> {
}
