package net.javaguides.apirest.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonaService {

    @Autowired
    PersonRepository personRepository;

    public void createPerson(Person person){
        personRepository.save(person);
    }
    public ArrayList<Person> findAll(){
        return (ArrayList<Person>) personRepository.findAll();
    }
}
