//  Use TDD to write tests and a SUT (system under test - the actual implementing class) for a
// method that takes a String input and outputs that same String with every other letter uppercase.
// For example, if you enter “cat”, it returns “cAt”. If you enter “apple”, it returns
// “aPpLe”. You should end up with two classes - a class with the new method in it, and a
// class for the unit tests that test your new method. Your test class should contain as many
// test methods as necessary to test the proper implementation.

package com.azienda.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise1Test {

    @Test
    public void testAlternateCapsCat() {
        String output = Exercise1.alternateUppercase("cat");
        assertEquals("cAt", output);
    }

    @Test
    public void testAlternateCapsApple() {
        String output = Exercise1.alternateUppercase("apple");
        assertEquals("aPpLe", output);
    }
}
