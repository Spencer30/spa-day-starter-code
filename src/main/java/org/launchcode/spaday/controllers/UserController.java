package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping
    @ResponseBody
    public String userHome(){
        return "This is the user home";
    }

    @GetMapping("add")
    public String displayAddUserForm(){
        return "user/add";
    }

    @PostMapping("index")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        // add form submission handling code here
        if(user.getPassword().equals(verify)){
            return "user/index";
        } else{
            model.addAttribute("error", true);
            model.addAttribute("user", user.getUsername());
            model.addAttribute("emailSave", user.getEmail());
            return "user/add";
        }
    }






}
