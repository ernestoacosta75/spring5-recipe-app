package guru.springframework.repositories;


import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface for the data layer used for the UnitOfMeasure entites management.
 *
 * To be implemented.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
