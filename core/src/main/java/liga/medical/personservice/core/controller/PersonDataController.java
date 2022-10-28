package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.repository.PersonDataRepository;
import org.apache.tomcat.jni.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PersonData")
public class PersonDataController {

    private final PersonDataRepository personDataRepository;

    public PersonDataController(PersonDataRepository personDataRepository) {
        this.personDataRepository = personDataRepository;
    }
    @GetMapping
    public void get(){
        personDataRepository.findAll();
    }
    @PostMapping
    public PersonData add(@RequestBody PersonData personData){
        return personDataRepository.saveAndFlush(personData);
    }
}
