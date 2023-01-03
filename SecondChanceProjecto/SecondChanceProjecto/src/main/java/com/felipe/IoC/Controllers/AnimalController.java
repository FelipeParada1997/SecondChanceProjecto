package com.felipe.IoC.Controllers;

import com.felipe.IoC.Services.AnimalesService;
import com.felipe.IoC.Services.UserService;
import org.springframework.web.bind.annotation.GetMapping;

public class AnimalController {

    private final AnimalesService serviceRepository;

    private final UserService serviceUser;

    public AnimalController(AnimalesService serviceRepository, UserService serviceUser) {
        this.serviceRepository = serviceRepository;
        this.serviceUser = serviceUser;
    }
    //crear perfil de animal cuando se clikea y se ven todos los datos

}
