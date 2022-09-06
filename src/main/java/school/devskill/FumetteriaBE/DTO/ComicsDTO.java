package school.devskill.FumetteriaBE.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComicsDTO {
    int id;
    String name;

    String description;
    String type;
    String author;
    String category;

}
