package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class represents the controller
 * to manage the <code>Recipe</code> entities requests.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
@Slf4j
@Controller
@RequestMapping("recipes")
public class RecipeController {

    private final guru.springframework.services.RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    /**
     * Returns the recipe entity with that id.
     * @param id
     * @param model
     * @return A recipe entity.
     */
    @RequestMapping("/show/{id}")
    public String showById(@PathVariable String id, Model model) {
        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));

        return "recipe/show";
    }
}
