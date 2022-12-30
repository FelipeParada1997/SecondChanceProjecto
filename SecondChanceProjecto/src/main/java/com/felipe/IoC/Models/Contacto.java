package com.felipe.IoC.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name="contactos")
public class Contacto extends Base{

    @NotNull
    private Integer numero_cel;

    @NotBlank
    @Size(min = 2)
    private String direccion;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    public Contacto() {
    }

    public Contacto(Integer numero_cel, String direccion) {
        this.numero_cel = numero_cel;
        this.direccion = direccion;
    }
}
