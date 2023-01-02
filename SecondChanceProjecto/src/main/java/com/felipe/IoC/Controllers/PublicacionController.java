package com.felipe.IoC.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.felipe.IoC.Models.Animal;
import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Models.User;
import com.felipe.IoC.Services.AnimalesService;
import com.felipe.IoC.Services.PublicacionService;
import com.felipe.IoC.Services.TipoAnimalService;
import com.felipe.IoC.Services.UserService;

@Controller
public class PublicacionController {

    private final PublicacionService publicacionService;
    private final UserService userService;
    private final AnimalesService animalesService;

    public PublicacionController(PublicacionService publicacionService,UserService userService,AnimalesService animalesService){

        this.publicacionService = publicacionService;
        this.userService = userService;
        this.animalesService= animalesService;
    }
    // para mostrar publicacion get
    @GetMapping("/Publicacion")
    public String crearPublicacion(@ModelAttribute("publicacion") Publicacion publicacion){
        return "publicacionver";
    }
    //para mostrar crear por post
    @PostMapping("/Publicacion")
    public String crearPublicacionn(@Valid @ModelAttribute("publicacion") Publicacion publicacion,BindingResult result, HttpSession session){
        if (result.hasErrors()) {
            return "publicacionver";
        }
        Long id = (Long) session.getAttribute("userId");
        User user = userService.findById(id);
        publicacion.setUser(user);
        publicacionService.save(publicacion);
        return "redirect:/home";
    }

    //para mostrar todas en lista
    //@GetMapping("/verPublicaciones")
    //public String verPublicaciones(@ModelAttribute("publicacion")Publicacion publicacion,Model model){
    //    List<Publicacion> publicacionn = publicacionService.mostrarPublicaciones();
    //    model.addAttribute("publicacion", publicacionn);
    //    return "home";
    //}
    //para borrar la publicacion
    @GetMapping("/SecondChance/Publicacion/{id}/delete")
    public String deletePublic(@PathVariable("id")Long id){
        publicacionService.delete(id);
        return "redirect:/SecondChance";
    }
    //profeeeeeeeeeee ayudaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

}


