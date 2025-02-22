package com.example.people.manager.view;

import com.example.people.manager.serv.PersonServ;
import com.example.people.manager.serv.data.Person;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("people")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonRest {

    @EJB
    private PersonServ serv;

    @GET
    @Path("info")
    public String info() throws Exception {
        return "Info Service: " + this + " by " + serv;
    }

    @GET
    public List<Person> findAllPeople(Person value) throws Exception {
        List<Person> list = serv.findAllPeople();
        return list;
    }

    @GET
    @Path("/{personId}")
    public Person findPerson(@PathParam("personId") Long personId) throws Exception {
        return serv.findPerson(personId);
    }

    @POST
    public Person createPerson(Person value) throws Exception {
        return serv.createPerson(value);
    }

    @PUT
    @Path("/{personId}")
    public Person updatePerson(@PathParam("personId") Long personId, Person value) throws Exception {
        return serv.updatePerson(personId, value);
    }

    @DELETE
    @Path("/{personId}")
    public Person removePerson(@PathParam("personId") Long personId) throws Exception {
        return serv.removePerson(personId);
    }
}
