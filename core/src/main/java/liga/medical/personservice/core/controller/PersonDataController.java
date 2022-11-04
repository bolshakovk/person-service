package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.entity.PersonData;
import liga.medical.personservice.core.repository.PersonDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/person_data")
public class PersonDataController {
    private final PersonDataRepository personDataRepository;

    @GetMapping
    public List<PersonData> getPersonData(){
        System.out.println("getPersondata getMapping: " + personDataRepository.findAll());
        return personDataRepository.findAll();
    }
    @PostMapping
    public PersonData addPersonData(@RequestBody String personData){
        System.out.println("persondata postmapping");
        return personDataRepository.findByName(personData);
    }
}
