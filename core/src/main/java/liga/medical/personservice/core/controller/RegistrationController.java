package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.entity.User;
import liga.medical.personservice.core.service.api.UserService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class RegistrationController {
    private final UserService userService;
    private final UserValidator userValidator;

    @PostMapping("/registration")
    public String addUser(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {

        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.save(userForm);
        return "redirect:/";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }
}
