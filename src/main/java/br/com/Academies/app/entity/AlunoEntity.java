package br.com.Academies.app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private String cpf;

    @ManyToMany
    @JoinTable(name = "Aluno_Plano",
            joinColumns = @JoinColumn(name= "aluno_id"),
            inverseJoinColumns = @JoinColumn(name= "plano_id"))
    private List<PlanoEntity> planoEntityList;


}
