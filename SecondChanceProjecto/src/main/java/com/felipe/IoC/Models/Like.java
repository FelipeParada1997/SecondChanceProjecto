package com.felipe.IoC.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "likes")
public class Like extends Base{
    
    private int like;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="users_id")
    private User user;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="publicaciones_id")
    private Publicacion publicacion;

    public Like(int like) {
        this.like = like;
    }
}

