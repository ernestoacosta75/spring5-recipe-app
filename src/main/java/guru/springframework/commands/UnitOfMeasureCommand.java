package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class represents the Command Object
 * for the <code>UnitOfMeasure</code> entity.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
@Getter
@Setter
@NoArgsConstructor
public class UnitOfMeasureCommand {
    private Long id;
    private String description;
}
