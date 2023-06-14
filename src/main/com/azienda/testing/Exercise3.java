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

public class Exercise3 {
    private static final String[] clusters = new String[]{"tr", "fl", "pl", "sn", "bl", "cr"};

    /**
     * Funzione che prende come input una frase formata da due parole, estrapola i prefissi,
     * e genera una frase da due parole con i prefissi invertiti.
     * @param sentence
     * @return
     */
    public static String makeSpoonerism (String sentence) { // INPUT -> crushing blow
        String[] words = sentence.split("\\s"); // {"crushing", "blow"}

        // Lavoro sulla prima parola
        String firstWord = words[0]; // crushing
        String prefixFirstWord = getPrefix(firstWord); // cr

        // Recupero sottostringa della prima parola partendo dall'indice 2 (rimuovendo quindi le prime 2 lettere) se è un prefisso cluster, altrimenti dall'indice 1 se ho recuperato solo l'iniziale
        String firstWordWithoutPrefix = firstWord.substring(prefixFirstWord.length()); // ushing

        // Lavoro sulla seconda parola eseguendo gli stessi passaggi fatti per la prima
        String secondWord = words[1]; // blow
        String prefixSecondWord = getPrefix(secondWord); // bl
        String secondWordWithoutPrefix = secondWord.substring(prefixSecondWord.length()); // ow

        // Per lavorare con le stringhe utilizzo StringBuilder
        StringBuilder finalPhrase = new StringBuilder() // blushing crow
                .append(prefixSecondWord) // bl
                .append(firstWordWithoutPrefix) // ushing
                .append(" ") // " "
                .append(prefixFirstWord) // cr
                .append(secondWordWithoutPrefix);

        return finalPhrase.toString();
    }

    /**
     * Se la parola in input inizia con una delle stringhe dell'array clusters,
     * ritorni il prefisso della parola
     * altrimenti ritorni la prima lettera (gestisco eccezioni della traccia)
     * @param word
     * @return
     */
    private static String getPrefix (String word) {
        for (String cluster : clusters) {
            if (word.startsWith(cluster)) { // Se la parola inizia con il cluster
                return cluster; // salvo il cluster
            }
        }

        // Eccezione dell'esempio Flat cap -> Cat flap
        return word.substring(0, 1); // Ritorno la prima lettera
    }

//    public static void main(String[] args) {
////        System.out.println(makeSpoonerism("crushing blow"));
////        System.out.println(getPrefix("sound"));
//    }
}

