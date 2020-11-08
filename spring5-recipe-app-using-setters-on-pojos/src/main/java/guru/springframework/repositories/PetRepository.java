package guru.springframework.repositories;

import guru.springframework.domain.Owner;
import guru.springframework.domain.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {


}
