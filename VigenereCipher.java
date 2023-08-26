// need key
// turn key into char[]
// for until key char[] equals length of message
// shift alphabet
// substring 0 to wordArr.length

import java.util.ArrayList;
import java.util.Scanner;

class VigenereCipher {

    public static void main(String[] args) {

        // Scanner scnr = new Scanner(System.in);

//        System.out.println("Enter a word or sentence: ");
        String word = "ATTACKATDAWN";

//        System.out.println("Enter the shift value: ");
        String key = "LEMON";

        while (key.length() < word.length())
            key += key;
//        System.out.println(key);

        char[] wordArr = word.toCharArray();
        char[] keystreamArr = key.substring(0,word.length()).toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        int shift = 0;
        // this loop for each letter it will change
        for (int i = 0; i < wordArr.length; i++) {
            // this loop shifts the alphabet
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == keystreamArr[j])
                    shift = alphabet[j];
            }
        }
        System.out.println(shift);

        // substring the letter from the key to the alphabet (shift the alphabet to start at the key's letter)


//        while (keyArr.length != wordArr.length) {
//            if
//        }

//        System.out.println("Encrypting...");
//        System.out.println(encryptedWord.encrypt(word, shift));
    }
}