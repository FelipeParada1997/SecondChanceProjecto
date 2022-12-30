package com.felipe.IoC.Models;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users_inst")
public class UserInst extends Base{
    
    @NotBlank
    @Size(min = 2)
    private String nombre;


    @NotBlank
    @Size(min = 5)
    private String nombre_Inst;

    @NotBlank
    @Size(min = 5)
    private String rut;

    @NotBlank
    @Size(min = 5)
    private String telefono;

    @NotBlank
    @Size(min = 5)
    private String ciudad;

    @NotBlank
    @Size(min = 5)
    private String Region;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    public UserInst() {
    }

    public UserInst(String nombre,String nombre_Inst,String rut,String telefono,String ciudad,String region) {
        this.nombre = nombre;
        this.nombre_Inst = nombre_Inst;
        this.rut = rut;
        this.telefono = telefono;
        this.ciudad = ciudad;
        Region = region;
    }

    
}
