package liga.medical.personservice.core.service;

import liga.medical.personservice.core.entity.Contact;
import liga.medical.personservice.core.repository.ContactRepository;
import liga.medical.personservice.core.service.api.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Override
    public Contact save(Contact contact) {
        return contactRepository.saveAndFlush(contact);
    }

    @Override
    public void delete(Contact contact) {
        contactRepository.delete(contact);
    }

    @Override
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    @Override
    public Optional<Contact> getById(Long id) {
        return contactRepository.findById(id);
    }
}
