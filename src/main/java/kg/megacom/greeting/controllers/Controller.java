package kg.megacom.greeting.controllers;

import kg.megacom.greeting.models.Person;
import kg.megacom.greeting.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public Person getPerson(){
        return personService.getPerson();
    }


    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ResponseEntity<?> savePerson(@RequestBody Person person){
        personService.savePerson(person);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

}
