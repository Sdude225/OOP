package lab3;

public class Main {

    public static void main(String[] args) throws Exception {
        String data = TextManipulation.readFile("C:\\Users\\HP\\Desktop\\lab3.txt");
        System.out.println(TextManipulation.sentenceNumber(data));
    }
}
