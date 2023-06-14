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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void convertToPerson() {
        Person person = Person.convert("Billy, Bob, 1234 Big St., Big City, California, 90210");
        assertEquals(new Person("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"), person);
    }

    @Test
    public void convertToMorePeople() {
        String morePeople = "Billy, Bob, 1234 Big St., Big City, California, 90210|Jackson, Joe, 4321 Little St., Little City, New York, 20109";
        Person[] people = Person.convertMorePeople(morePeople);

        // Devo identificare i singoli oggetti da confrontare per il test
        Person[] peopleForTest = {
                new Person("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"),
                new Person("Jackson", "Joe", "4321 Little St.", "Little City", "New York", "20109")
        };

        // Ora posso confrontare gli array per il test
        assertArrayEquals(peopleForTest, people);
    }

}
