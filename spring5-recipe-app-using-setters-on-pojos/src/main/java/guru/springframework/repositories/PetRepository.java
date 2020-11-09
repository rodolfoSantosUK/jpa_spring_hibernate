package guru.springframework.repositories;

import guru.springframework.domain.Owner;
import guru.springframework.domain.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {


}
