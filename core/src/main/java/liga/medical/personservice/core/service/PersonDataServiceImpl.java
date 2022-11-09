package liga.medical.personservice.core.service;

import liga.medical.personservice.core.entity.PersonData;
import liga.medical.personservice.core.repository.PersonDataRepository;
import liga.medical.personservice.core.service.api.PersonDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonDataServiceImpl implements PersonDataService {

    private final PersonDataRepository personDataRepository;

    @Override
    public void save(PersonData personData) {
        personDataRepository.saveAndFlush(personData);
    }

    @Override
    public void delete(PersonData personData) {
        personDataRepository.delete(personData);
    }

    @Override
    public List<PersonData> getAll() {
        return personDataRepository.findAll();
    }
}
