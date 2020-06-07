package com.example.people.manager.serv;

import com.example.people.manager.serv.data.Person;

public interface PersonServ {

    public Person createPerson(Person value) throws Exception;

    public Person updatePerson(Person value) throws Exception;

    public Person removePerson(Person value) throws Exception;

    public Person findPerson(Person value) throws Exception;
}
