package com.dev.model;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;

/**
 * Created by Oops on 8/6/2016.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int roll;
    private String firstName;
    private String lastName;

    @OneToOne(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    private Address address;

    public void setId(long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(long id, int roll, String firstName, String lastName, Address address) {
        this.id = id;
        this.roll = roll;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
