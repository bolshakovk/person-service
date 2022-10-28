package liga.medical.personservice.core.impl;

import liga.medical.personservice.core.model.Illness;
import liga.medical.personservice.core.repository.IllinessRepository;
import liga.medical.personservice.core.service.IllnessService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IllnessServiceImpl  implements IllnessService {

    private final IllinessRepository illinessRepository;

    public IllnessServiceImpl(IllinessRepository illinessRepository) {
        this.illinessRepository = illinessRepository;
    }

    @Override
    public Illness addIllness(Illness illness) {
        return illinessRepository.saveAndFlush(illness);
    }

    @Override
    public void deleteIllness(Illness illness) {
        illinessRepository.delete(illness);
    }

    @Override
    public Optional<Illness> getIllnessById(Long id) {
        return illinessRepository.findById(id);
    }

    @Override
    public Illness editIllness(Illness illness) {
        return illinessRepository.saveAndFlush(illness);
    }

    @Override
    public List<Illness> getAll() {
        return illinessRepository.findAll();
    }
}
