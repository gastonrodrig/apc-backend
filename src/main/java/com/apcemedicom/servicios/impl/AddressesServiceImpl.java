package com.apcemedicom.servicios.impl;

import com.apcemedicom.repositorios.AddressesRepository;
import com.apcemedicom.modelo.Addresses;
import com.apcemedicom.servicios.AddressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

@Service
public class AddressesServiceImpl implements AddressesService {
    @Autowired
    private AddressesRepository addressesRepository;

    @Override
    public Addresses agregarAddress(Addresses address){ return addressesRepository.save(address);}
    @Override
    public Addresses activarAddress(Addresses address){return addressesRepository.save(address);}
    @Override
    public Set<Addresses> obtenerAddresses(){ return new LinkedHashSet<>(addressesRepository.findAll());}
    @Override
    public Addresses obtenerAddress(Long addressId) { return addressesRepository.findById(addressId).get();}
    @Override
    public void eliminarAddress(Long addressId) {
        Addresses address = new Addresses();
        address.setAddressId(addressId);
        addressesRepository.delete(address);
    }
    @Override
    public List<Addresses> obtenerAddressesPorUsuario(Long id) {
        return addressesRepository.findByUserId(id);
    }
}
