package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple Java Bean domain object representing a Category.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
@Data
@EqualsAndHashCode(exclude = "recipes")
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes = new HashSet<Recipe>();

    public Category() { }

    protected boolean canEqual(final Object other) {
        return other instanceof Category;
    }

}
