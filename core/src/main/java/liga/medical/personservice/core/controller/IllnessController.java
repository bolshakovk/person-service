package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.Illness;
import liga.medical.personservice.core.repository.IllinessRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Illnes")
public class IllnessController {
    private final IllinessRepository illinessRepository;

    public IllnessController(IllinessRepository illinessRepository) {
        this.illinessRepository = illinessRepository;
    }
    @PostMapping
    public Illness add(Illness illness){
        return illinessRepository.saveAndFlush(illness);
    }
    @GetMapping
    public void get(){
        illinessRepository.findAll();
    }
}
