package com.example.people.manager.impl;

import com.example.people.entity.PePerson;
import com.example.people.manager.impl.mapper.PersonMapper;
import com.example.people.manager.local.PersonLocal;
import com.example.people.manager.serv.PersonServ;
import com.example.people.manager.serv.data.Person;
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
    public Person createPerson(Person value) throws Exception {
        PePerson entity = PersonMapper.mapperToPePerson(value);
        entity = local.createPerson(entity);
        return PersonMapper.mapperToPerson(entity);
    }

    @Override
    public Person updatePerson(Person value) throws Exception {
        PePerson entity = PersonMapper.mapperToPePerson(value);
        entity = local.updatePerson(entity);
        return PersonMapper.mapperToPerson(entity);
    }

    @Override
    public Person removePerson(Person value) throws Exception {
        PePerson entity = local.findPerson(value.getPersonId());
        entity = local.removePerson(entity);
        return PersonMapper.mapperToPerson(entity);
    }

    @Override
    public Person findPerson(Person value) throws Exception {
        PePerson entity = local.findPerson(value.getPersonId());
        return PersonMapper.mapperToPerson(entity);
    }

}
