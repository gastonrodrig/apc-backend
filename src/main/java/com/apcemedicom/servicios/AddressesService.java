package com.apcemedicom.servicios;

import com.apcemedicom.modelo.Addresses;

import java.util.List;
import java.util.Set;

public interface AddressesService {
    Addresses agregarAddress(Addresses address);
    Addresses activarAddress(Addresses address);
    Set<Addresses> obtenerAddresses();
    Addresses obtenerAddress(Long addressId);
    void eliminarAddress(Long addressId);
    List<Addresses> obtenerAddressesPorUsuario(Long id);
}
