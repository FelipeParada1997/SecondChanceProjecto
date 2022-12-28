package com.felipe.IoC.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "animales")
@Getter
@Setter
public class Animales extends Base{

    public Animales() {
    }
    
    private String nombre;
    private int edad; 
    private String tamaño;


}
