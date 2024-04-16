package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @NotNull
    @Length(min = 2, max = 10)
    @Pattern(regexp = "[A-Z0-9]+")
    private String id;
    @Column(nullable = false, length = 500)
    private String name;
}
