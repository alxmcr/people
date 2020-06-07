package com.example.people.manager.local.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CommonLocal {

    public static final String PERSISTENCE_UNIT = "PEOPLE_PU";
    // PersistenceContext
    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    public EntityManager em;
}
