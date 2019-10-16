package lab3;

import java.util.Arrays;
import java.util.Collections;

public class TextManipulation {
    static int SentenceNumber(String Text){
        return Text.split("([.!?]+)([\\s\\n])").length;
    }

    static int WordsNumber(String Text){
        return Text.split("[, \\s]+").length;
    }

    static int LetterNumber(String Text){
        int counter = 0;
        for(int i = 0; i < Text.length(); i++){
            if(Character.isLetter(Text.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    static void LetterType(String Text){
        int vowels = 0, consonants = 0;
        Text = Text.toLowerCase();
        for(int i = 0; i < Text.length(); i++){
            if(Text.charAt(i) == 'a' || Text.charAt(i) == 'e' || Text.charAt(i) == 'i'
                    || Text.charAt(i) == 'u' || Text.charAt(i) == 'o'){
                vowels++;
            }
            else if((Text.charAt(i) >= 'a' && Text.charAt(i) <= 'z')){
                consonants++;
            }
        }
        System.out.println("Number of consonants " + consonants);
        System.out.println("Number of vowels " + vowels);
    }

    static void TopWords(String Text){
        String[] text;
        int index1 = 0, index2 = 0, length = 0, k = 1, max = 0, places = 1;
        text = Text.split("[, .\\s]+");
        int[] indexes = new int[text.length];
        for(int i = 0 ; i < text.length; i++){
            text[i] = text[i].toUpperCase();
        }
        Arrays.sort(text);
        for(int i = 0; i<text.length; i++){
            if(text[i].length() > length){
                length = text[i].length();
                index1 = i;
            }
        }
        System.out.println("The longest word " + text[index1]);
        for(int i = 0; i < text.length-1; i++){
            indexes[i] = k;
            if(text[i].equals(text[i+1])){
                k++;
            }
            else {
                k=1;
            }
        }

        while(places <= 5){
            for(int i = 0; i < indexes.length; i++){
                if(indexes[i] > max){
                    max = indexes[i];
                    index2 = i;
                }
            }
            for(int i = 0; i < max; i++){
                indexes[index2-i] = 0;
            }
            max = 0;
            System.out.println("Top " + places + " word - " + text[index2]);
            places++;
        }
   }

}