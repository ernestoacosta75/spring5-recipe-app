package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Interface for the data layer used for the Category entites management.
 *
 * To be implemented.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    /**
     * Returns a Category entity with that description.
     * @param description
     * @return Category entity
     */
    Optional<Category> findByDescription(String description);
}
