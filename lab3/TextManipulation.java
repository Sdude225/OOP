package lab3;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TextManipulation {

    static String readFile(String fileName) throws Exception{
        String data;
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    static int sentenceNumber(String data){
        int sentNum = 0;
        for(int i = 0; i < data.length()-1; i++){
            if(data.charAt(i) == '.' && data.charAt(i+1) != '.'){
                sentNum++;
            }
        }
        if(data.charAt(data.length()-1) == '.'){
            sentNum++;
        }
        return sentNum;
    }

//    static int wordNumber(String data){
//        int wordNumber = 0;
//        for(int i = 0; i < data.length(); i++){
//
//        }
//    }
}
