package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.entity.Illness;
import liga.medical.personservice.core.mapper.IllnessMapper;
import liga.medical.personservice.core.service.api.IllnesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/illness")
public class IllnessController {
    private final IllnesService illnesService;

    @GetMapping
    public void getIllness(){
        System.out.println("get");
        illnesService.getIllness();
    }

    @PostMapping
    public void addIllness(Illness illness){
        System.out.println("post");
        illnesService.addIllness(illness);
    }
}
