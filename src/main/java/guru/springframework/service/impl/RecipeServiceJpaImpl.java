package guru.springframework.service.impl;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * This class represents the map service implementation
 * to manage the <code>Recipe</code> entities.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
@Slf4j
@Service
public class RecipeServiceJpaImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceJpaImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Set<Recipe> findAll() {
        log.debug("I am in the Recipe JPA Service implementation");

        Set<Recipe> recipeSet = new HashSet<Recipe>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

        return recipeSet;
    }
}
