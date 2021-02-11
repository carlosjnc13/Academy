package br.com.Academies.app.models;

import java.util.Set;

public class Aluno {

    private Long id;
    private String nome;
    private String telefone;
    private String cpf;
    private Set<Plano> planoList;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Plano> getPlanoList() {
        return planoList;
    }

    public void setPlanoList(Set<Plano> planoList) {
        this.planoList = planoList;
    }
}
