package guru.springframework.repositories;

import guru.springframework.domain.PetType;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {



}
