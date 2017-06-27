package controller;

import dao.ManageUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String submit(Model model, @RequestParam String username,
                         @RequestParam String password) {
        if (username != null && password != null) {
            if (new ManageUser().login(username, password)!= null) {
                model.addAttribute("msg", "welcome" + username);
                return "success";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "login";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "login";
        }
    }
}