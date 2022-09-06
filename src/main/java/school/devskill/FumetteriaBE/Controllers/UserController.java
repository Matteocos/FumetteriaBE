package school.devskill.FumetteriaBE.Controllers;

import org.springframework.web.bind.annotation.*;

import school.devskill.FumetteriaBE.HTTPUtility.HTTPUtility;
@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_USER)
public class UserController {
    @GetMapping(value= HTTPUtility.GET+"/{id}")
    public String getUser(@PathVariable int id){return "ciao sono un metodo che risponde ad una  chiamata GET, la risposta sara un json con l'utente con id inserito nell uri";}


    @PostMapping(value = HTTPUtility.SEARCH)
    public String seaechUser(){return "ciao son un metodo che risponde ad una chiamata POST, la risposta sarà un json con la lista degli utenti";}


    @PostMapping (value= HTTPUtility.CREATE)
    public String createUser(/**User user**/){return"ciao sono un metodo che risponde ad una chiamata CREATE";}


    @DeleteMapping(value=HTTPUtility.DELETE+"/{id}")
    public String deleteUser(@PathVariable int id){return "ciao sono un metodo che risponde ad una chiamata DELETE, la risposta saà un json con le informazioni sull utente eliminato";}


    @PutMapping(value = HTTPUtility.UPDATE)
    public String updateUser(/** USER user**/){return " ciao sono un metodo che risponde ad una chiamata PUT (modificare un User";}
}
