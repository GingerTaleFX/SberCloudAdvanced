package sbercloud.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sbercloud.models.User;
import sbercloud.models.UserRepository;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/")
public class IndexController {

    private final UserRepository userRepository;

    @GetMapping
    public String index(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.getPrincipal().equals("anonymousUser"))
            return "redirect:/login";
        try {
            User currentUser = (User) auth.getPrincipal();
            currentUser = userRepository.findByUsername(currentUser.getUsername());
            model.addAttribute("user", currentUser);
        } catch (ClassCastException ex) {
            log.error("Cast error: " + ex.getMessage());
        }
        return "index";
    }

    @GetMapping("/colored")
    public String colored(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.getPrincipal().equals("anonymousUser"))
            return "redirect:/login";
        try {
            User currentUser = (User) auth.getPrincipal();
            currentUser = userRepository.findByUsername(currentUser.getUsername());
            model.addAttribute("user", currentUser);
        } catch (ClassCastException ex) {
            log.error("Cast error: " + ex.getMessage());
        }
        return "colored";
    }
}
