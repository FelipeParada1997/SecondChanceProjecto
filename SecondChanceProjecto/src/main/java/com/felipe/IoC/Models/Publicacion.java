package com.felipe.IoC.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "publicacion")
public class Publicacion extends Base{

    @NotBlank
    @Size(message = "tu publicacion necesita un titulo")
    private String Titulo;

    @NotBlank
    @Size(message = "falta agregar una descripcion")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    public Publicacion(){
    }

    
}
