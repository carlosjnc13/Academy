package br.com.Academies.app.repository;

import br.com.Academies.app.entity.AcademyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademyRepository extends JpaRepository<AcademyEntity, Long> {
}
