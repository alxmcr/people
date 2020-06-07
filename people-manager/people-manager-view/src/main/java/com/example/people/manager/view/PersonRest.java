package com.example.people.manager.view;

import com.example.people.manager.serv.PersonServ;
import com.example.people.manager.serv.data.Person;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
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
    @Path("find")
    public Person findPerson(Person value) throws Exception {
        return serv.findPerson(value);
    }

    @POST
    @Path("create")
    public Person createPerson(Person value) throws Exception {
        return serv.createPerson(value);
    }

    @PUT
    @Path("update")
    public Person updatePerson(Person value) throws Exception {
        return serv.updatePerson(value);
    }

    @DELETE
    @Path("remove")
    public Person removePerson(Person value) throws Exception {
        return serv.removePerson(value);
    }
}
