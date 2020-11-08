package guru.springframework.repositories;

import guru.springframework.domain.Vet;
import guru.springframework.domain.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
