package guru.springframework.repositories;


import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Interface for the data layer used for the UnitOfMeasure entites management.
 *
 * To be implemented.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    /**
     * Returns an UnitOfMeasure entity with that description.
     * @param description
     * @return UnitOfMeasure entity
     */
    Optional<UnitOfMeasure> findByDescription(String description);
}
