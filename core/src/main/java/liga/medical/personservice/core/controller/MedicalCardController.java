package liga.medical.personservice.core.controller;

import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.entity.MedicalCard;
import liga.medical.personservice.core.service.api.MedicalCardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
@RequestMapping("/medical_card")
public class MedicalCardController {
    private final MedicalCardService medicalCardService;
    @GetMapping("/medical-card")
    @ApiOperation(value = "get all")
    public List<MedicalCard> getAllMedicalCards() {
        return medicalCardService.getAll();
    }
    @GetMapping("/medical-card/{id}")
    @ApiOperation(value = "get by id")
    public Optional<MedicalCard> geMedicalCardById(@PathVariable long id) {
        return medicalCardService.find(id);
    }
}
