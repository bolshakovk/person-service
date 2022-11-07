package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.entity.PersonData;
import liga.medical.personservice.core.repository.PersonDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/person_data")
@Slf4j
@Api(value = "API для работы оператора клиники")
public class PersonDataController {
    private final PersonDataRepository personDataRepository;

    @GetMapping
    @ApiOperation(value ="get all person data")
    public List<PersonData> getPersonData(){
        return personDataRepository.findAll();
    }


    @PostMapping
    @ApiOperation(value ="get person data")
    public PersonData addPersonData(@RequestBody String personData){
        return personDataRepository.findByName(personData);
    }
}
