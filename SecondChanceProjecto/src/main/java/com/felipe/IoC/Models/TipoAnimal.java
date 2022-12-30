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
@Table(name = "tipoanimales")
public class TipoAnimal extends Base{
    
    private String tipoAnimal;

    @OneToMany(mappedBy="tipoAnimal", fetch = FetchType.LAZY)
    private List<Animal> animales;

    public TipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

}
