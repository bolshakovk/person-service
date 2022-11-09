package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.entity.Adress;
import liga.medical.personservice.core.service.api.AdressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/adress")
@Api(value = "work with adress")
public class AdressController {
    private final AdressService adressService;

    @GetMapping("/adress")
    public List<Adress> getAllAddress() {
        return adressService.getAll();
    }
    @GetMapping("/address/{id}")
    @ApiOperation(value = "get by id")
    public Adress getAddressById(@PathVariable long id) {
        return adressService.getById(id);
    }
    @PostMapping("/address")
    @ApiOperation(value = "add new adress")
    public ResponseEntity<String> addAddressInDB(@RequestBody Adress adress) {
        adressService.save(adress);
        return ResponseEntity.ok("ok");
    }

    @DeleteMapping("/address/{id}")
    @ApiOperation(value = "delete")
    public void deleteAddressInDB(@PathVariable Adress id) {
        adressService.delete(id);
    }
}
