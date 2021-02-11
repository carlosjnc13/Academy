package br.com.Academies.app.repository;

import br.com.Academies.app.entity.PlanoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoRepository extends JpaRepository<PlanoEntity, Long> {
}
