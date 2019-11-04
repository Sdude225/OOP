package lab4;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        String Text = readFile("C:\\Users\\HP\\Desktop\\lab4.txt");
        ParanthesesChecker checker = new ParanthesesChecker(Text);
        checker.isValid();
    }

    static String readFile(String fileName) throws Exception {
        String data;
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
}
