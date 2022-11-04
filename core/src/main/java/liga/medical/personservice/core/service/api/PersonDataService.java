package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.entity.PersonData;

import java.util.List;

public interface PersonDataService {
    PersonData save(PersonData personData);
    void delete(PersonData personData);
    PersonData find(String name);
    List<PersonData> getAll();
}
