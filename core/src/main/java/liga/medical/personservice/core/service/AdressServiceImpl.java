package liga.medical.personservice.core.service;

import liga.medical.personservice.core.entity.Adress;
import liga.medical.personservice.core.repository.AdressRepository;
import liga.medical.personservice.core.service.api.AdressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdressServiceImpl implements AdressService {

    private final AdressRepository adressRepository;

    @Override
    public void save(Adress adress) {
        adressRepository.saveAndFlush(adress);
    }

    @Override
    public void delete(Adress adress) {
        adressRepository.delete(adress);
    }

    @Override
    public List<Adress> getAll() {
        return adressRepository.findAll();
    }

    @Override
    public Adress getById(Long id) {
        return adressRepository.getOne(id);
    }
}
