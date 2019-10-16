package lab3;

import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) throws Exception {
        String Text = readFile("C:\\Users\\HP\\Desktop\\lab3.txt");
        System.out.println("Number of sentences " + TextManipulation.SentenceNumber(Text));
        System.out.println("Number of words " + TextManipulation.WordsNumber(Text));
        System.out.println("Number of letters " + TextManipulation.LetterNumber(Text));
        TextManipulation.LetterType(Text);
        TextManipulation.TopWords(Text);

    }

    static String readFile(String fileName) throws Exception {
        String data;
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
}
