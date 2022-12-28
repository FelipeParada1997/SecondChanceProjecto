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
@Table(name="contactos")
public class Contacto extends Base{
    @NotNull
    private Integer numero_cel;
    @Size(min = 2,max = 500)
    private String direccion;

    public Contacto() {
    }

    public Contacto(Integer numero_cel, String direccion) {
        this.numero_cel = numero_cel;
        this.direccion = direccion;
    }
}
