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

    @NotBlank
    @Size(min = 1, max = 6)
    private String apellido;

    @PastOrPresent
    private Integer fecha_nacimiento;

    @NotBlank
    private String tipo_usuario;

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

}
