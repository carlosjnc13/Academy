package br.com.Academies.app.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AcademyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;

    @OneToMany(mappedBy = "academyEntity")
    private Set<PlanoEntity> planoEntityList;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Set<PlanoEntity> getPlanoEntityList() {
        return planoEntityList;
    }

    public void setPlanoEntityList(Set<PlanoEntity> planoEntityList) {
        this.planoEntityList = planoEntityList;
    }
}
