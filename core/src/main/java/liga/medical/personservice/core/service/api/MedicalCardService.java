package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.entity.MedicalCard;

import java.util.List;
import java.util.Optional;

public interface MedicalCardService {
    MedicalCard save(MedicalCard medicalCard);
    void delete(MedicalCard medicalCard);
    Optional<MedicalCard> find(Long id);
    List<MedicalCard> getAll();
}
