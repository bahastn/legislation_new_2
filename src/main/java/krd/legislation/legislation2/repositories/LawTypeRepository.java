package krd.legislation.legislation2.repositories;

import krd.legislation.legislation2.models.LawTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LawTypeRepository extends JpaRepository<LawTypes, Long> {

}
