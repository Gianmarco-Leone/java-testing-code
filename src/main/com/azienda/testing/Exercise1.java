//  Use TDD to write tests and a SUT (system under test - the actual implementing class) for a
// method that takes a String input and outputs that same String with every other letter uppercase.
// For example, if you enter “cat”, it returns “cAt”. If you enter “apple”, it returns
// “aPpLe”. You should end up with two classes - a class with the new method in it, and a
// class for the unit tests that test your new method. Your test class should contain as many
// test methods as necessary to test the proper implementation.

package com.azienda.testing;

public class Exercise1 {
    public static String alternateUppercase (String word) {
        StringBuilder sb = new StringBuilder(word.length()); // Dove salvo nuova stringa

        // Le lettere pari devono essere maiuscole
        for (int index = 0; index < word.length(); index++) {
            String currentLetter = word.substring(index, index + 1); // Recupero lettera corrente

            if (index % 2 == 0) {
                sb.append(currentLetter);
            } else {
                sb.append(currentLetter.toUpperCase());
            }

        }

        return sb.toString();
    }
}
