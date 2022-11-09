package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    Contact save(Contact contact);
    void delete(Contact contact);
    List<Contact> getAll();
    Optional<Contact> getById(Long id);
}
