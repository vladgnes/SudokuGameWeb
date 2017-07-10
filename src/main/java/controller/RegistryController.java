package controller;

import dao.ManageUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistryController {
    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String init(Model model) {
        return "registry";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String submit(Model model, @RequestParam String username,
                         @RequestParam String password) {
        if (username != null && password != null) {
            if (new ManageUser().registry(username, password)) {
                model.addAttribute("msg", false);
                return "success";
            } else {
                model.addAttribute("msg", true);
                return "registry";
            }
        } else {
            model.addAttribute("msg", true);
            return "registry";
        }
    }
}
