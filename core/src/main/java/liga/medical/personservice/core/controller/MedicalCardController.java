package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.MedicalCard;
import liga.medical.personservice.core.repository.MedicalCardRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/MedicalCard")
public class MedicalCardController {
    private final MedicalCardRepository medicalCardRepository;

    public MedicalCardController(MedicalCardRepository medicalCardRepository) {
        this.medicalCardRepository = medicalCardRepository;
    }

    @PostMapping
    public MedicalCard add(@RequestBody MedicalCard medicalCard){
        return medicalCardRepository.saveAndFlush(medicalCard);
    }
    @GetMapping
    public void get(){
        medicalCardRepository.findAll();
    }
}
