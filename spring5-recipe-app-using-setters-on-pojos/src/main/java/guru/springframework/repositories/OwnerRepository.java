package guru.springframework.repositories;

import guru.springframework.domain.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

   Owner findByLastName(String lastName);

   List<Owner> findAllByLastNameLike(String lastName);

}
