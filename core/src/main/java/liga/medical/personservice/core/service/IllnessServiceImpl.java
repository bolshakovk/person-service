package liga.medical.personservice.core.service;

import liga.medical.personservice.core.entity.Illness;
import liga.medical.personservice.core.repository.IllnessRepository;
import liga.medical.personservice.core.service.api.IllnesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IllnessServiceImpl implements IllnesService {
    private final IllnessRepository illnessMapper;


    @Override
    public void getIllness() {
        illnessMapper.findAll();
    }

    @Override
    public Illness getIllness(Long id) {
        return illnessMapper.getOne(id);
    }
}
