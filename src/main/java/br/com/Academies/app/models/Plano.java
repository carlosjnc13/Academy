package br.com.Academies.app.models;

import java.util.List;
import java.util.Set;

public class Plano {

    private Long id;
    private String nome;
    private Double preco;
    private List<Aluno> alunoList;
    private Set<Aula> aulaList;
    private Academy academy;

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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public Set<Aula> getAulaList() {
        return aulaList;
    }

    public void setAulaList(Set<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    public Academy getAcademy() {
        return academy;
    }

    public void setAcademy(Academy academy) {
        this.academy = academy;
    }
}
