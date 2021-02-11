package br.com.Academies.app.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class PlanoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;

    @ManyToMany(mappedBy = "planoEntityList")
    private List<AlunoEntity> alunoEntityList;

    @OneToMany(mappedBy = "planoEntity")
    private Set<AulaEntity> aulaEntityList;

    @ManyToOne
    private AcademyEntity academyEntity;

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

    public List<AlunoEntity> getAlunoEntityList() {
        return alunoEntityList;
    }

    public void setAlunoEntityList(List<AlunoEntity> alunoEntityList) {
        this.alunoEntityList = alunoEntityList;
    }

    public Set<AulaEntity> getAulaEntityList() {
        return aulaEntityList;
    }

    public void setAulaEntityList(Set<AulaEntity> aulaEntityList) {
        this.aulaEntityList = aulaEntityList;
    }

    public AcademyEntity getAcademyEntity() {
        return academyEntity;
    }

    public void setAcademyEntity(AcademyEntity academyEntity) {
        this.academyEntity = academyEntity;
    }
}
