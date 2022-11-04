package liga.medical.personservice.core.service;

import liga.medical.personservice.core.entity.Illness;
import liga.medical.personservice.core.mapper.IllnessMapper;
import liga.medical.personservice.core.service.api.IllnesService;
import org.springframework.stereotype.Service;

@Service
public class IllnessServiceImpl implements IllnesService {
    private final IllnessMapper illnessMapper;

    public IllnessServiceImpl(IllnessMapper illnessMapper) {
        this.illnessMapper = illnessMapper;
    }

    @Override
    public void getIllness() {
        illnessMapper.getIllness();
    }

    @Override
    public Illness addIllness(Illness illness) {
        return illnessMapper.addIlness(illness);
    }
}
