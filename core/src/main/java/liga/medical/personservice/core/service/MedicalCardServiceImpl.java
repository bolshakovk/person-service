package liga.medical.personservice.core.service;

import liga.medical.personservice.core.entity.MedicalCard;
import liga.medical.personservice.core.repository.MedicalCardRepository;
import liga.medical.personservice.core.service.api.MedicalCardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MedicalCardServiceImpl implements MedicalCardService {
    private final MedicalCardRepository medicalCardRepository;
    @Override
    public MedicalCard save(MedicalCard medicalCard) {
        return medicalCardRepository.saveAndFlush(medicalCard);
    }

    @Override
    public void delete(MedicalCard medicalCard) {
        medicalCardRepository.delete(medicalCard);
    }

    @Override
    public Optional<MedicalCard> find(Long id) {
        return medicalCardRepository.findById(id);
    }

    @Override
    public List<MedicalCard> getAll() {
        return medicalCardRepository.findAll();
    }
}
