package com.example.people.manager.serv;

import com.example.people.manager.serv.data.Person;
import java.util.List;

public interface PersonServ {

    public List<Person> findAllPeople() throws Exception;

    public Person findPerson(Long personId) throws Exception;

    public Person createPerson(Person value) throws Exception;

    public Person updatePerson(Long personId, Person value) throws Exception;

    public Person removePerson(Long personId) throws Exception;
}
