package br.com.Academies.app.models;

import java.time.LocalTime;

public class Aula {

    private Long id;
    private String nome;
    private LocalTime duracao;
    private String instrutor;
    private Academy academia;
    private Plano planoEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public Academy getAcademia() {
        return academia;
    }

    public void setAcademia(Academy academia) {
        this.academia = academia;
    }

    public Plano getPlanoEntity() {
        return planoEntity;
    }

    public void setPlanoEntity(Plano planoEntity) {
        this.planoEntity = planoEntity;
    }
}
