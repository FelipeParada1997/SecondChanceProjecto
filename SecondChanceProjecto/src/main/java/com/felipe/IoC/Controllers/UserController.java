package com.felipe.IoC.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Models.User;
import com.felipe.IoC.Services.PublicacionService;
import com.felipe.IoC.Services.UserService;

@Controller
public class UserController {
    private final UserService userService;
    private final PublicacionService publicacionService;

    public UserController(UserService userService, PublicacionService publicacionService) {
        this.userService = userService;
        this.publicacionService = publicacionService;
    }


    //---------------------------------------------register login--------------------------------------------------

    @PostMapping("/registro")
    public String indexregister(@Valid @ModelAttribute("user") User user,
                                BindingResult result, HttpSession session, Model model) {
        if (result.hasErrors()) {
            return "registro";
        }
        User u = userService.registerUser(user);
        session.setAttribute("userId", u.getId());
        return "redirect:/home";
    }
    
    @GetMapping("/registro")
    public String vistaRegistro(@ModelAttribute("user")User user){
        return "registro";
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
            model.addAttribute("error","porfavor intente otra vez");
            return "login";
        }
    }

    @GetMapping("/login")
    public String vistaLogin(){
        return "login";
    }

    //---------------------------------------------Home--------------------------------------------------

//para ver publicaciones en el home en general
    @GetMapping("home")
    public String home(@ModelAttribute ("user")User user, Model model, HttpSession session){
        Long id = (Long) session.getAttribute("publicacionid");
        Publicacion publicaciones = publicacionService.findById(id);
        model.addAttribute("publicaciones", publicaciones);
    return"home";
    }
}
