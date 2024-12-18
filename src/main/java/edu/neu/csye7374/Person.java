package edu.neu.csye7374;

import java.util.UUID;

public class Person {

    private UUID id;
    private String firstName;
    private String lastName;
    private int age;

    public Person(UUID id, int age, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User[id= " + id + ", firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + "]";
    }
}
