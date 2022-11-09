package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.entity.Illness;

public interface IllnesService {
    void getIllness();
    Illness getIllness(Long id);
}
