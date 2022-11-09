package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.entity.PersonData;

import java.util.List;

public interface PersonDataService {
    void save(PersonData personData);
    void delete(PersonData personData);
    List<PersonData> getAll();
}
