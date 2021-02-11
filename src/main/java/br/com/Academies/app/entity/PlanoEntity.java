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
    @ManyToOne
    @JoinColumn(name= "Academia_id")
    private AcademyEntity academia;

    @ManyToMany(mappedBy = "planoEntityList")
    private List<AlunoEntity> alunoEntityList;

    @OneToMany(mappedBy = "planoEntity")
    private Set<AulaEntity> aulaEntityList;



}
