package service;

import dto.AddressDto;
import entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public void addAddress(AddressDto address) {
        Address entity = new Address();
        entity.setStreet(address.getStreet());
        entity.setNumber(address.getNumber());
        entity.setZipcode(address.getZipcode());
        entity.setCity(address.getCity());
    }
}
