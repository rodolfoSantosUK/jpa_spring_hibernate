package guru.springframework.repositories;

import guru.springframework.domain.Speciality;
import guru.springframework.domain.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
