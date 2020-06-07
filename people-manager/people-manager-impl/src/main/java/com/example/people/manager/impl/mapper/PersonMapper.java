package com.example.people.manager.impl.mapper;

import com.example.people.entity.PePerson;
import com.example.people.manager.serv.data.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonMapper {

    private static void mapperToPePerson(Person from, PePerson to) {
        to.setPersonId(from.getPersonId());
        to.setCode(from.getCode());
        to.setName(from.getName());
        to.setLastname(from.getLastname());
    }

    private static void mapperToPerson(PePerson from, Person to) {
        to.setPersonId(from.getPersonId());
        to.setCode(from.getCode());
        to.setName(from.getName());
        to.setLastname(from.getLastname());
    }

    public static Person mapperToPerson(PePerson from) {
        if (from == null) {
            return null;
        }
        Person to = new Person();
        mapperToPerson(from, to);
        return to;
    }

    public static List<PePerson> mapperToPePersonList(List<Person> fromList) {
        if (fromList == null) {
            return null;
        }
        List<PePerson> toList = new ArrayList();
        fromList.stream().forEach(from -> {
            PePerson to = mapperToPePerson(from);
            toList.add(to);
        });
        return toList;
    }

    public static PePerson mapperToPePerson(Person from) {
        if (from == null) {
            return null;
        }
        PePerson to = new PePerson();
        mapperToPePerson(from, to);
        return to;
    }

    public static List<Person> mapperToPersonList(List<PePerson> fromList) {
        if (fromList == null) {
            return null;
        }
        List<Person> toList = new ArrayList();
        fromList.stream().forEach(from -> {
            Person to = mapperToPerson(from);
            toList.add(to);
        });
        return toList;
    }
}
