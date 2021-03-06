package guru.springframework.repositories;

import guru.springframework.domain.Speciality;
import guru.springframework.domain.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}
