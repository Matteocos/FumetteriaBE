package school.devskill.FumetteriaBE.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.FumetteriaBE.HTTPUtility.HTTPUtility;
@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_COMIC)
public class ComicsController {
    @GetMapping(value= HTTPUtility.GET+"/{id}")
    public String getComic(@PathVariable int id)
    {return "ciao sono un metodo che risponde ad una  chiamata GET, la risposta sara un json con il comic con id inserito nell uri";}


    @PostMapping(value = HTTPUtility.SEARCH)
    public String seaechComic(){return "ciao son un metodo che risponde ad una chiamata POST, la risposta sarà un json con la lista dei comic";}


    @PostMapping (value= HTTPUtility.CREATE)
    public String createComic(/**Comic c**/){return"ciao sono un metodo che risponde ad una chiamata CREATE";}


    @DeleteMapping(value=HTTPUtility.DELETE+"/{id}")
    public String deleteComic(@PathVariable ("id") int id){return "ciao sono un metodo che risponde ad una chiamata DELETE, la risposta sarà un json con le informazioni sull comic eliminato";}


    @PutMapping(value = HTTPUtility.UPDATE)
    public String updateComic(/** Comic c**/){return " ciao sono un metodo che risponde ad una chiamata PUT (modificare un Comic";}
}


