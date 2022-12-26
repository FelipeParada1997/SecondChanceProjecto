package com.felipe.IoC.Models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "users")
public class User extends Base{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 2, max = 40 )
    private String nombre;

    @NotBlank
    @Size
    private String apellido;


    private Integrer fecha_nacimiento;


    @NotNull
    @Size(min = 2,max = 150)
    @Email(message = "error de formato")
    private String email;

    @NotNull
    @Size(min = 8, max = 100)
    private String password;

    @Transient
    private String passwordConfirm;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;


    public User() {
    }


}
