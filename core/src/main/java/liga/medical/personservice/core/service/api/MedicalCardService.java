package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.dto.ContactDto;
import liga.medical.personservice.core.dto.MedicalCardDto;
import liga.medical.personservice.core.entity.Contact;
import liga.medical.personservice.core.entity.MedicalCard;

import java.util.List;

public interface MedicalCardService {
    MedicalCard save();
    void delete();
    MedicalCard find(String name);
    List<MedicalCardDto> getAll();
}
