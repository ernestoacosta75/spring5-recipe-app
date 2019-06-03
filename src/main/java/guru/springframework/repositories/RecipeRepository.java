package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface for the data layer used for the Recipe entites management.
 *
 * To be implemented.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
