//  Use TDD to write a program that takes a String of two words and creates a “spoonerism” of
// them. A spoonerism is when the first letters or phonemes of two words are transposed. An
// example would be “crushing blow” -> “blushing crow” or “my bad” -> “by mad”. Use
// these examples for test use-cases:
//          Crushing blow ---> Blushing Crow
//          Sound bite    ---> Bound site
//          Flat cap      ---> Cat flap
//          Sad ballad    ---> Bad sallad
//          Master plan   ---> Plaster man
//          Trail snacks  ---> Snail tracks
//
//              1. Can you make it work regardless of capitalization? - WORK IN PROGRESS -

package com.azienda.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise3Test {

    @Test
    public void crushingBlow () {
        String spoonerismDone = Exercise3.makeSpoonerism("crushing blow");
        assertEquals("blushing crow", spoonerismDone);
    }

    @Test
    public void soundBite () {
        String spoonerismDone = Exercise3.makeSpoonerism("sound bite");
        assertEquals("bound site", spoonerismDone);
    }

    @Test
    public void flatCap () {
        String spoonerismDone = Exercise3.makeSpoonerism("flat cap");
        assertEquals("cat flap", spoonerismDone);
    }

    @Test
    public void sadBallad () {
        String spoonerismDone = Exercise3.makeSpoonerism("sad ballad");
        assertEquals("bad sallad", spoonerismDone);
    }

    @Test
    public void trailSnacks () {
        String spoonerismDone = Exercise3.makeSpoonerism("trail snacks");
        assertEquals("snail tracks", spoonerismDone);
    }
}
