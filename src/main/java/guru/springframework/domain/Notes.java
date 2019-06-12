package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Simple Java Bean domain object representing a Notes.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;

    public Notes() {
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Notes;
    }

}
