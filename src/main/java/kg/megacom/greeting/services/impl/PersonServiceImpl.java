package kg.megacom.greeting.services.impl;

import kg.megacom.greeting.models.Person;
import kg.megacom.greeting.services.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public void savePerson(Person person) {
        System.out.println(person.getName());
    }

    @Override
    public Person getPerson() {
        return new Person(1, "Aibek", "3525235", "ajsfhvajf");
    }
}
