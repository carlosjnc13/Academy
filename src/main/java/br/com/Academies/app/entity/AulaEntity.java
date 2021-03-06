package br.com.Academies.app.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class AulaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalTime duracao;
    private String instrutor;
    @ManyToOne
    @JoinColumn(name= "Academia_id")
    private AcademyEntity academia;

    @ManyToOne
    private PlanoEntity planoEntity;

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

    public AcademyEntity getAcademia() {
        return academia;
    }

    public void setAcademia(AcademyEntity academia) {
        this.academia = academia;
    }

    public PlanoEntity getPlanoEntity() {
        return planoEntity;
    }

    public void setPlanoEntity(PlanoEntity planoEntity) {
        this.planoEntity = planoEntity;
    }
}
