package sk.upjs.library_demo.service;

import org.springframework.stereotype.Service;
import sk.upjs.library_demo.entity.AddressEntity;
import sk.upjs.library_demo.repository.AddressRepository;

import java.util.List;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<AddressEntity> findAll() {
        System.out.println("Ahoj svet.");
        return addressRepository.findAll();
    }

    public AddressEntity save(AddressEntity addressEntity) {
        System.out.println("Vytvoril som");
        return addressRepository.save(addressEntity);
    }

    public void deleteById(Long id) {
        System.out.println("Mazal som");
        addressRepository.deleteById(id);
    }
}