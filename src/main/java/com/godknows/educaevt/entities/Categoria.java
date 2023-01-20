package com.godknows.educaevt.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    private String descricao;

    public Categoria(){
    }

    public Categoria(Integer id, String descricao) {
        Id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
