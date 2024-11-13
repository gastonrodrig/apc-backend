package com.apcemedicom.repositorios;

import com.apcemedicom.modelo.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressesRepository extends JpaRepository<Addresses, Long> {
    List<Addresses> findByUserId(Long userId);

}
