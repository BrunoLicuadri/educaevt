package com.godknows.educaevt.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    private String descricao;

    @OneToMany(mappedBy="categoria")
    private List<Atividade> atv = new ArrayList<>();

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

    public List<Atividade> getAtv() {
        return atv;
    }
}
