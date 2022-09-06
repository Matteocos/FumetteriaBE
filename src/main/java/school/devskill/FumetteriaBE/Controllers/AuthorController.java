package school.devskill.FumetteriaBE.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import school.devskill.FumetteriaBE.Command.AuthorCommand;
import school.devskill.FumetteriaBE.DTO.AuthorDTO;
import school.devskill.FumetteriaBE.HTTPUtility.HTTPUtility;

@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_AUTHOR)
public class AuthorController {
    private  final ObjectMapper objectMapper=new ObjectMapper();


    @GetMapping(value=HTTPUtility.GET+"/{id}")
    public String getAuthor(@PathVariable int id){return "ciao sono un metodo che risponde ad una  chiamata GET, la risposta sara un json con l'autore con id inserito nell uri";}


    @PostMapping (value= HTTPUtility.CREATE)
    public String createAuthor(@RequestBody AuthorDTO a){return"ciao sono un metodo che risponde ad una chiamata CREATE";}


    @DeleteMapping(value=HTTPUtility.DELETE+"/{id}")
    public String deleteAuthor(@PathVariable("id")int id){return "ciao sono un metodo che risponde ad una chiamata DELETE, la risposta saà un json con le informazioni sull author eliminato";}


    @PutMapping(value = HTTPUtility.PUT)
    public String updateAuthor(/** Author a**/){return " ciao sono un metodo che risponde ad una chiamata PUT";}


    @PostMapping(value = HTTPUtility.SEARCH)
    public String searchAuthor(@RequestBody AuthorCommand a){
        AuthorCommand authorCommand=null;
       /** try{
            authorCommand=objectMapper.convertValue(cercaAuthor(a.getID(), a.getName(),a.getSurname()), AuthorCommand.class);

        }catch(IllegalArgumentException e){
            e.printStackTrace();


        }finally {
            return  authorCommand.toString();
        }**/

return "ciao sono un metodo che risponde as una chiamata post, la risposta sara un json con l'autore";}
}
