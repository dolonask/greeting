package kg.megacom.greeting.services;

import kg.megacom.greeting.models.Person;

public interface PersonService {

    void savePerson(Person person);

    Person getPerson();


}
