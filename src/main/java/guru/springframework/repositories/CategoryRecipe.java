package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface for the data layer used for the Category entites management.
 *
 * To be implemented.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface CategoryRecipe extends CrudRepository<Category, Long> {
}
