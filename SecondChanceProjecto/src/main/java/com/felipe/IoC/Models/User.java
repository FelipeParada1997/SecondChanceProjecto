package com.felipe.IoC.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends Base{

    @NotBlank
    @Size(min = 2, max = 40 )
    private String nombre;


    @NotBlank
    @Size(min = 5)
    private String apellido;

    @PastOrPresent
    private Date fecha_nacimiento;

    @Email(message = "error de formato")
    private String email;

    @NotBlank
    @Size(min = 7)
    private String password;

    @Transient
    private String passwordConfirm;

    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private List<Publicacion> publicaciones;

    public User() {
    }

    public User(String nombre, String apellido, Date fecha_nacimiento, String email, String password, String passwordConfirm) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }
}
