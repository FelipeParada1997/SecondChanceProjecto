package com.felipe.IoC.Controllers;

import com.felipe.IoC.Models.User;
import com.felipe.IoC.Services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //---------------------------------------------Home--------------------------------------------------

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String index(Model model, HttpSession session,
                        @ModelAttribute("user") User user) {
        return "/user/home.jsp";
    }

    @PostMapping(value="/registerpost")
    public String indexregister(@Valid @ModelAttribute("user") User user,
                                BindingResult result, HttpSession session, Model model) {
        if (result.hasErrors()) {
            return "/user/home.jsp";
        }
        if(!user.getPassword().equals(user.getPasswordConfirm())) {
            model.addAttribute("Error", "Las contraseñas no son iguales");
            return "/user/home.jsp";
        }
        User u = userService.registerUser(user);
        session.setAttribute("userId", u.getId());
        return "redirect:/home";

    }

    @PostMapping(value="/loginpost")
    public String indexlogin(@RequestParam("email") String email,
                             @RequestParam("password") String password, Model model, HttpSession session) {
        boolean authenticated = userService.authenticateUser(email, password);
        if(authenticated) {
            User u = userService.findByEmail(email);
            session.setAttribute("userId", u.getId());
            return "redirect:/home";
        } else {
            model.addAttribute("error","Please try again");
            return "/user/home.jsp";
        }
    }


}
