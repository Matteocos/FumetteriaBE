package school.devskill.FumetteriaBE.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.devskill.FumetteriaBE.Command.LoginCommand;
import school.devskill.FumetteriaBE.DTO.UserDTO;
import school.devskill.FumetteriaBE.HTTPUtility.HTTPUtility;

@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_LOGIN)
public class LoginControllers {

    @PostMapping(value ="/login")
    public UserDTO login(@RequestBody LoginCommand command){
        UserDTO utente = new UserDTO(9,"Paolo","Bianco","dddsdsa@mail.com","");
        return utente;
    }}