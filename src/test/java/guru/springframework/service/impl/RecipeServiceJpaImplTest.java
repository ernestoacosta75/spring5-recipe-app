package guru.springframework.service.impl;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * This class represents the Unit Test
 * for the service <code>RecipeServiceJpaImpl</code>.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public class RecipeServiceJpaImplTest {

    RecipeServiceJpaImpl recipeServiceJpa;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        // Initializing the mockitos
        MockitoAnnotations.initMocks(this);

        recipeServiceJpa = new RecipeServiceJpaImpl(recipeRepository);
    }

    @Test
    public void findAll() {
        Recipe recipe = new Recipe();
        HashSet<Recipe> recipeHashSet = new HashSet<Recipe>();
        recipeHashSet.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipeHashSet);

        Set<Recipe> recipeSet = recipeServiceJpa.findAll();

        assertEquals(recipeSet.size(), 1);

        // Verifying that the recipeRepository's findAll() method is call once
        verify(recipeRepository, times(1)).findAll();
    }
}