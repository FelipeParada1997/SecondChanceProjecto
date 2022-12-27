package com.felipe.IoC.Models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Integer fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
