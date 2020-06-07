package com.example.people.manager.serv;

import com.example.people.manager.serv.data.Person;
import java.util.List;

public interface PersonServ {

    public List<Person> findAllPeople() throws Exception;

    public Person createPerson(Person value) throws Exception;

    public Person updatePerson(Person value) throws Exception;

    public Person removePerson(Person value) throws Exception;

    public Person findPerson(Person value) throws Exception;
}
