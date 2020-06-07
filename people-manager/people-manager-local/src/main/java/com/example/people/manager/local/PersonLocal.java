package com.example.people.manager.local;

import com.example.people.entity.PePerson;
import com.example.people.manager.local.common.CommonLocal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class PersonLocal extends CommonLocal {

    public PePerson findPerson(Long id) throws Exception {
        return em.find(PePerson.class, id);
    }

    public PePerson createPerson(PePerson value) throws Exception {
        em.persist(value);
        return value;
    }

    public PePerson updatePerson(PePerson entity) throws Exception {
        em.merge(entity);
        return entity;
    }

    public PePerson removePerson(PePerson entity) throws Exception {
        em.remove(entity);
        return entity;
    }
}
