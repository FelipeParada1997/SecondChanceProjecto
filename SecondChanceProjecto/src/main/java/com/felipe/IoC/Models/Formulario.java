package com.felipe.IoC.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "formularios")
public class Formulario extends Base {

    private String pregunta;
    private String respuestas;

    public Formulario() {
    }
}
