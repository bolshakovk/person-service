package liga.medical.personservice.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FirstController {

    @GetMapping
    public String first(){
        System.out.println("clicked");
        return "main";
    }
}
