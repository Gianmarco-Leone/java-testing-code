//  Use TDD to write tests for a method that can take a String input like:
// “Billy, Bob, 1234 Big St., Big City, California, 90210”
// And return an Object representing that person. You can name your class Exercise2 or
// Person or whatever you like. To test this easily, you’ll need to have the IDE generate an
// equals() & hashcode() method in your class that models a Person (you’ll learn more
// about that in a later section). To do so, you can right click on an empty line within your
// class and select, “Generate…” and click “Next” every time (probably will be three times)
// followed by “Finish”. You’ll now be able to continue with your test(s).
//      1. Modify your method to accept a String like:
//      “Billy, Bob, 1234 Big St., Big City, California, 90210 | Joe,Smith,5678 Little St., Little
//      City, New York, 20109”
//      Your new method should return an array of Objects that model a Person. You should
//      reuse the same Person class you used before (whatever you named it). The text input
//      should separate the details of people by the pipe symbol ‘ | ’. There should be no limit
//      on the number of people details you can pass in on one String. In the example String
//      above, I present only two people, but you could keep adding a | symbol and more
//      people details and you should get back an array with that many people objects in it. Try
//      to reuse what you already did for the first part of this exercise and just build on top of it.

package com.azienda.testing.ex2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;

    public Person(String firstName, String lastName, String streetAddress, String city, String state, String zipcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public static Person[] convertMorePeople (String input) {
        String[] peopleStrings = input.split("\\|"); // suddivido la stringa intera formata in realtà da 2 persone
        Person[] people = new Person[peopleStrings.length]; // n persone generate

        for (int index=0; index < peopleStrings.length; index++) {
            people[index] = convert(peopleStrings[index]); // invoco la funzione convert() per istanziare oggetto Person da una stringa di dati
        }

        return people;
    }

    /**
     * Funzione per estrapolare una serie di dati da una stringa,
     * ed utilizzarli per istanziare un oggetto persona
     * @param data
     * @return
     */
    public static Person convert(String data) {
        String[] parts = data.split(",");
        String firstName = parts[0].strip();
        String lastName = parts[1].strip();
        String streetAddress = parts[2].strip();
        String city = parts[3].strip();
        String state = parts[4].strip();
        String zipcode = parts[5].strip();
        return new Person(firstName, lastName, streetAddress, city, state, zipcode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(streetAddress, person.streetAddress) && Objects.equals(city, person.city) && Objects.equals(state, person.state) && Objects.equals(zipcode, person.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, streetAddress, city, state, zipcode);
    }
}
