package com.example.people.manager.impl;

import com.example.people.entity.PePerson;
import com.example.people.manager.impl.mapper.PersonMapper;
import com.example.people.manager.local.PersonLocal;
import com.example.people.manager.serv.PersonServ;
import com.example.people.manager.serv.data.Person;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@Local(PersonServ.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PersonImpl implements PersonServ {

    @EJB
    private PersonLocal local;

    @Override
    public List<Person> findAllPeople() throws Exception {
        List<PePerson> list = local.findAllPeople();
        return PersonMapper.mapperToPersonList(list);
    }

    @Override
    public Person findPerson(Long personId) throws Exception {
        PePerson entity = local.findPerson(personId);
        return PersonMapper.mapperToPerson(entity);
    }

    @Override
    public Person createPerson(Person value) throws Exception {
        PePerson entity = PersonMapper.mapperToPePerson(value);
        entity = local.createPerson(entity);
        return PersonMapper.mapperToPerson(entity);
    }

    @Override
    public Person updatePerson(Long personId, Person valueUpdated) throws Exception {
        // Find
        PePerson entity = local.findPerson(personId);
        // Set Id
        valueUpdated.setPersonId(personId);
        // Pass values updated
        PersonMapper.mapperToPePerson(valueUpdated, entity);
        // Update in the database
        entity = local.updatePerson(entity);
        return PersonMapper.mapperToPerson(entity);
    }

    @Override
    public Person removePerson(Long personId) throws Exception {
        PePerson entity = local.findPerson(personId);
        entity = local.removePerson(entity);
        return PersonMapper.mapperToPerson(entity);
    }
}
