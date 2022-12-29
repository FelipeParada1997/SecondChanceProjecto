package com.felipe.IoC.Controllers;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Models.User;
import com.felipe.IoC.Services.PublicacionService;
import com.felipe.IoC.Services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    private final UserService userService;
    private final PublicacionService publicacionService;

    public UserController(UserService userService, PublicacionService publicacionService) {
        this.userService = userService;
        this.publicacionService = publicacionService;
    }


    //---------------------------------------------register login--------------------------------------------------

    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public String index(Model model, HttpSession session,
                        @ModelAttribute("user") User user) {
        return "/home";
    }

    @PostMapping("/registro")
    public String indexregister(@Valid @ModelAttribute("user") User user,
                                BindingResult result, HttpSession session, Model model) {
        if (result.hasErrors()) {
            return "registro";
        }
        if(!user.getPassword().equals(user.getPasswordConfirm())) {
            model.addAttribute("Error", "Las contraseñas no son iguales");
            return "registro";
        }
        User u = userService.registerUser(user);
        session.setAttribute("userId", u.getId());
        return "redirect:/home";

    }

    @PostMapping("/login")
    public String indexlogin(@RequestParam("email") String email,
                            @RequestParam("password") String password, Model model, HttpSession session) {
        boolean authenticated = userService.authenticateUser(email, password);
        if(authenticated) {
            User u = userService.findByEmail(email);
            session.setAttribute("userId", u.getId());
            return "redirect:/home";
        } else {
            model.addAttribute("error","Please try again");
            return "login";
        }
    }

    @GetMapping("/login")
    public String vistaLogin(){
        return "login";
    }

    //---------------------------------------------Home--------------------------------------------------

    @RequestMapping (value = "/homee", method = RequestMethod.GET)
    public String home(Model model,HttpSession session) {
        if((Long) session.getAttribute("userId") == null) {
            return "redirect:/";
        }else {
            List<Publicacion> publicaciones = publicacionService.mostrarPublicacions();
            model.addAttribute("listpulicacion", publicaciones);
            model.addAttribute("user", userService.findUserById((Long)session.getAttribute("userId")));
            return "/user/home";
        }
    }

}
