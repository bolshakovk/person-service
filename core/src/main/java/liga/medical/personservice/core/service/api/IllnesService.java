package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.entity.Illness;

import java.util.List;

public interface IllnesService {
    void getIllness();
    Illness addIllness(Illness illness);
}
