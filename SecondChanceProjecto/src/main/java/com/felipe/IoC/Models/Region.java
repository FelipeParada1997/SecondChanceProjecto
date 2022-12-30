package com.felipe.IoC.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "regiones")
public class Region extends Base {
    
    @NotBlank
    private String nombre_region;

    @OneToMany(mappedBy="region", fetch = FetchType.LAZY)
    private List<Ciudad> ciudades;

    public Region() {
    }

    public Region(String nombre_region) {
        this.nombre_region = nombre_region;
    }
    
}
