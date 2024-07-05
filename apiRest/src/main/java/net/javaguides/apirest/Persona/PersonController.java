package net.javaguides.apirest.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public void createPerson(@RequestBody Person person){
        personaService.createPerson(person);
    }
    @GetMapping
    public List<Person> getAllPersons(){
        return personaService.findAll();
    }
}
