package br.com.Academies.app.entity;



import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

    public Set<PlanoEntity> getPlanoEntityList() {
        return planoEntityList;
    }

    public void setPlanoEntityList(Set<PlanoEntity> planoEntityList) {
        this.planoEntityList = planoEntityList;
    }
}
