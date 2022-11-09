package liga.medical.personservice.core.controller;

import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.entity.Adress;
import liga.medical.personservice.core.entity.Contact;
import liga.medical.personservice.core.service.api.ContactService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;
    @GetMapping("/adress")
    public List<Contact> getAll() {
        return contactService.getAll();
    }
    @GetMapping("/address/{id}")
    @ApiOperation(value = "get by id")
    public Optional<Contact> getAddressById(@PathVariable long id) {
        return contactService.getById(id);
    }
    @PostMapping("/address")
    @ApiOperation(value = "add new adress")
    public ResponseEntity<String> addAddressInDB(@RequestBody Contact contact) {
        contactService.save(contact);
        return ResponseEntity.ok("ok");
    }

    @DeleteMapping("/address/{id}")
    @ApiOperation(value = "delete")
    public void deleteAddressInDB(@PathVariable Contact id) {
        contactService.delete(id);
    }
}
