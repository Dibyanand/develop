package org.capg.datetime;

import java.time.LocalDate;

/**
 *
 * @author dibyanand
 */
public class Person {
    
    private String name;
    private LocalDate dateOfBirth;
    
    public Person(){}
    
    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", dateOfBirth=" + dateOfBirth + '}';
    }
}
