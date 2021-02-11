package br.com.Academies.app.models;

import java.util.Set;

public class Academy {

    private Long id;
    private String nome;
    private String rua;
    private String cep;
    private String estado;
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<Plano> getPlanoList() {
        return planoList;
    }

    public void setPlanoList(Set<Plano> planoList) {
        this.planoList = planoList;
    }
}
