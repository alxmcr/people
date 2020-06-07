package com.example.people.manager.view.config;

import com.example.people.manager.view.PersonRest;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class RestConfig extends Application {

    private static final Set<Class<?>> classSet = new HashSet();

    static {
        classSet.add(PersonRest.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classSet;
    }
}
