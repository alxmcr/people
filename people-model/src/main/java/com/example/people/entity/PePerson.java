package com.example.people.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PE_PERSON")
public class PePerson implements Serializable {

    @Id
    @GeneratedValue(generator = "PE_PERSON", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PE_PERSON", sequenceName = "PE_PERSON", allocationSize = 1)
    @Column(name = "PERSON_ID", unique = true, nullable = false, columnDefinition = "INTEGER")
    @NotNull(message = "ID Person is required")
    private Long personId;

    @Basic
    @Column(name = "CODE_", length = 10, columnDefinition = "VARCHAR(10)")
    private String code;

    @Basic
    @Column(name = "NAME_", length = 50, columnDefinition = "VARCHAR(50)")
    private String name;

    @Basic
    @Column(name = "LASTNAME", length = 100, columnDefinition = "VARCHAR(100)")
    private String lastname;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}