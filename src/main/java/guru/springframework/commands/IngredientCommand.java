package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * This class represents the Command Object
 * for the <code>Ingredient</code> entity.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
@Getter
@Setter@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand unitOfMeasureCommand;
}
