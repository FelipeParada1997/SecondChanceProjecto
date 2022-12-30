package com.felipe.IoC.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends Base{

    @NotBlank
    @Size(min = 2)
    private String nombre;


    @NotBlank
    @Size(min = 4)
    private String apellido;

    @NotNull
    @PastOrPresent
    private Date fecha_nacimiento;

    @Email(message = "error de formato")
    private String email;

    @NotBlank
    @Size(min = 7)
    private String password;

    @Transient
    private String passwordConfirm;

    @OneToOne(mappedBy="user", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Contacto contacto;

    @OneToOne(mappedBy="user", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private UserInst userInst;

    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private List<Publicacion> publicaciones;
    
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private List<Formulario> formularios;
}
