package guru.springframework.repositories;

import guru.springframework.domain.Owner;
import guru.springframework.domain.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
