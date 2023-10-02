
package com.example.demo.model;

import com.example.demo.dto.DadosAdicionarFilme;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    private String descricao;
    private int idadeMinima;
    private int duracao;

    public Filme(Integer id, String nome, String descricao, int idadeMinima, int duracao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.idadeMinima = idadeMinima;
        this.duracao = duracao;
    }
    
    

    public Filme(DadosAdicionarFilme dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.idadeMinima = dados.idadeMinima();
        this.duracao = dados.duracao();
               
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
}
    


