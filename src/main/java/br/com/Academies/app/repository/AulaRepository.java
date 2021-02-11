package br.com.Academies.app.repository;

import br.com.Academies.app.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<AlunoEntity, Long> {
}
