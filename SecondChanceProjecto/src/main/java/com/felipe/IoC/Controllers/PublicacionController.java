package com.felipe.IoC.Controllers;

import org.springframework.stereotype.Controller;

import com.felipe.IoC.Services.PublicacionService;
import com.felipe.IoC.Services.UserService;

@Controller
public class PublicacionController {

    private final PublicacionService publicacionService;
    private final UserService userService;

    public PublicacionController(PublicacionService publicacionService,UserService userService){

        this.publicacionService = publicacionService;
        this.userService = userService;
    }
}
