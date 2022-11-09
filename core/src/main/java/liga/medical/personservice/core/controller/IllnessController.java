package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.entity.Illness;
import liga.medical.personservice.core.service.api.IllnesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*@Controller
@RequiredArgsConstructor
@RequestMapping("/illness")
@Api(value ="illness controller")*/
public class IllnessController {
  /*  private final IllnesService illnesService;

    @GetMapping
    @ApiOperation(value ="get illness")
    public void getIllness(){
        illnesService.getIllness();
    }

    @PostMapping
    @ApiOperation(value ="add illness")
    public void addIllness(Illness illness){
        illnesService.addIllness(illness);
    }*/
}
