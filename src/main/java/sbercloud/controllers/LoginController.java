package sbercloud.controllers;

import sbercloud.models.AuthenticationRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String login(Model model) {
        model.addAttribute("user", new AuthenticationRequest());
        return "login";
    }

    @PostMapping
    public String validate(Model model) {
        return "redirect:/index";
    }
}
