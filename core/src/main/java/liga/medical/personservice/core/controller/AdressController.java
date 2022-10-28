package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.mapper.AdressMapper;
import liga.medical.personservice.core.model.Adress;
import org.apache.tomcat.jni.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adress")
public class AdressController {
    private final AdressMapper adressMapper;

    public AdressController(AdressMapper adressMapper) {
        this.adressMapper = adressMapper;
    }
    @GetMapping
    public List<Address> getAdress(){
        return adressMapper.getListAddress();
    }
    @PostMapping
    public Adress addAdress(@RequestBody Adress adress){
        return adressMapper.addAddress(adress);
    }
}
