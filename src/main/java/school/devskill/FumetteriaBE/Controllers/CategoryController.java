package school.devskill.FumetteriaBE.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.FumetteriaBE.HTTPUtility.HTTPUtility;

@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_CATEGORY)
public class CategoryController {
    @GetMapping(value = HTTPUtility.GET + "/{id}")
    public String getCategoria(@PathVariable int id) {
        return "ciao sono un metodo che risponde ad una chiamata GET, la risposta sara un json con la categria dell id nel uri";
    }

    @PostMapping(value = HTTPUtility.SEARCH)
    public String searchCategoria() {
        return "ciao sono un metodo che risponde ad una chiamata POST con un json con la lista delle categorie";
    }

    @PostMapping(value = HTTPUtility.CREATE)
    public String createCategoria(/** Categoria**/) {
        return "ciao sono un metodo che risponde ad una chiamata CREATE";
    }

    @DeleteMapping(value = HTTPUtility.DELETE + "/{id}")
    public String deleteCategoria(@PathVariable("id") int id) {
        return "cioa sono un metodo che risponde ad una chiamata delete,la risposta sara un jso con le informazioni della categoria eliminata";
    }

    @PutMapping(value = HTTPUtility.UPDATE)
    public String updateCategory(/**Categoria c**/) {
        return "ciao sono un metodo che risponde ad una chiamata PUT(serve per modficare la Categoria";
    }
}