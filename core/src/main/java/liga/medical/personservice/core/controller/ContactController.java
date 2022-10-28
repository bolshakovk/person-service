package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.Contact;
import liga.medical.personservice.core.repository.ContactRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Contact")
public class ContactController {
    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @GetMapping
    public List<Contact> getContact(){
        return contactRepository.findAll();
    }
    @PostMapping
    public void deleteContact(Contact contact){
        contactRepository.delete(contact);
    }
    @PostMapping
    public Contact add(Contact contact){
        return contactRepository.saveAndFlush(contact);
    }
}
