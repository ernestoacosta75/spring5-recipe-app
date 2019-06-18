package guru.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * This class is used to test the <code>IndexController</code> class.
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

    /**
     * - Asserting that the controller's method call returns the right view name.
     * - Verifying the mocks interactions.
     */
    @Test
    public void getIndexPage() {
        String viewName = indexController.getIndexPage(model);

        assertEquals("index", viewName);
        verify(recipeService, times(1)).findAll();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
    }
}