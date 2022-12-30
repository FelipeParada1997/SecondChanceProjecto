package com.felipe.IoC.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "ciudades")
public class Ciudad extends Base{
    
    @NotBlank
    private String nombre_ciudad;

    @OneToMany(mappedBy="ciudad", fetch = FetchType.LAZY)
    private List<Publicacion> publicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="region_id")
    private Region region;

    public Ciudad() {
    }

    public Ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
    
}
