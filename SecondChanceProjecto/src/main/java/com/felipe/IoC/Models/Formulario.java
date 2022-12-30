package com.felipe.IoC.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "formularios")
public class Formulario extends Base {

    @NotBlank
    @Size(min = 2)
    private String pregunta;

    @NotBlank
    @Size(min = 2)
    private String respuesta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="publicaciones_id")
    private Publicacion publicacion;

    public Formulario() {
    }

    public Formulario(String pregunta,String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
}
