package school.devskill.FumetteriaBE.Command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComicsCommand {

    String name;

    String description;
    String type;
    String author;
    String category;
}
