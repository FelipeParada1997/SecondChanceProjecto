package com.felipe.IoC.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends Base{

    @NotNull
    @Size(min = 2, max = 40 )
    private String nombre;

    @NotNull
    @Size(min = 1, max = 6)
    private String apellido;

    @PastOrPresent
    private Integer fecha_nacimiento;


    @NotNull
    @Size(min = 2,max = 150)
    @Email(message = "error de formato")
    private String email;

    @NotNull
    @Size(min = 8, max = 100)
    private String password;

    @Transient
    private String passwordConfirm;

    public User() {
    }

    public User(String nombre, String apellido, Integer fecha_nacimiento, String email, String password, String passwordConfirm) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }
}
