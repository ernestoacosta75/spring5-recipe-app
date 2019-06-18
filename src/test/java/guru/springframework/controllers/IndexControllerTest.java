package guru.springframework.controllers;

import guru.springframework.domain.Recipe;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * This class is used for the <code>IndexController</code> class Unit Test.
 *
 * @author Ernesto Antonio Rodriguez Acosta
 */
public class IndexControllerTest {

    IndexController indexController;

    @Mock
    guru.springframework.services.RecipeService recipeService;

    @Mock
    Model model;

    @Before
    public void setUp() throws Exception {
        // Initializing the mockitos
        MockitoAnnotations.initMocks(this);

        indexController = new IndexController(recipeService);
    }

    @Test
    public void testMockMvc() throws Exception {
        // Creating the MockMvc object
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    /**
     * - Asserting that the controller's method call returns the right view name.
     * - Verifying the mocks interactions.
     */
    @Test
    public void getIndexPage() {
        // given
        Set<Recipe> recipeSet = new HashSet<Recipe>();

        recipeSet.add(new Recipe());

        Recipe recipe = new Recipe();
        recipe.setDescription("Recipe 2");

        recipeSet.add(recipe);

        //when
        when(recipeService.findAll()).thenReturn(recipeSet);
        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        String viewName = indexController.getIndexPage(model);

        //then
        assertEquals("index", viewName);
        verify(recipeService, times(1)).findAll();
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());

        Set<Recipe> setInController = argumentCaptor.getValue();
        assertEquals(2, setInController.size());
    }
}