package com.felipe.IoC.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "personalidad")
public class Personalidad extends Base{
    

    private String tipo_personalidad;

    private String nivel_energia;

    @OneToMany(mappedBy="personalidad", fetch = FetchType.LAZY)
    private List<Animal> animales;


    public Personalidad(){

    }

    public Personalidad(String tipo_personalidad, String nivel_energia) {
        this.tipo_personalidad = tipo_personalidad;
        this.nivel_energia = nivel_energia;
    }

    
}
