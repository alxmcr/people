package com.example.people.manager.local;

import com.example.people.entity.PePerson;
import com.example.people.manager.local.common.CommonLocal;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Stateless
@LocalBean
public class PersonLocal extends CommonLocal {

    public List<PePerson> findAllPeople() throws Exception {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PePerson> cq = cb.createQuery(PePerson.class);
        // FROM
        Root<PePerson> root = cq.from(PePerson.class);
        // Select
        cq.select(root);
        List<PePerson> resultList = em.createQuery(cq).getResultList();
        return resultList;
    }

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
