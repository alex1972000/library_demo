package sk.upjs.library_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.upjs.library_demo.entity.AddressEntity;
import sk.upjs.library_demo.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public ResponseEntity<List<AddressEntity>> findAll() {
        return ResponseEntity.ok(addressService.findAll());
    }

    @PostMapping
    public ResponseEntity<AddressEntity> save(@RequestBody AddressEntity addressEntity) {
        return ResponseEntity.ok(addressService.save(addressEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        addressService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
