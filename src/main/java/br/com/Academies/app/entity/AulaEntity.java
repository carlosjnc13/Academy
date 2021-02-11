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

}
