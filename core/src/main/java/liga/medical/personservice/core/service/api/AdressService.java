package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.entity.Adress;

import java.util.List;

public interface AdressService {
    void save(Adress adress);
    void delete(Adress adress);
    List<Adress> getAll();
    Adress getById(Long id);
}
