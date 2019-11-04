package lab4;

import java.util.*;

public class ParanthesesChecker {
    public Stack<Character> parentheses = new Stack<Character>();
    public String[] temp;
    public List<String> lines = new ArrayList<String>();

    public ParanthesesChecker(String Text){
        temp = Text.split("([\\r?\\n]+)([\\r?\\n' ']+)");
        for(int i = 0; i < temp.length; i++){
            lines.add(temp[i]);
            }
    }



    public void isValid(){
        for(int i = 0; i < lines.size(); i++){
            for(int j = 0; j < lines.get(i).length(); j++){
                if(lines.get(i).charAt(j) == '('){ //lines[i].charAt(j)
                    parentheses.push('(');
                }
                else if(lines.get(i).charAt(j) == ')'){
                    if(parentheses.isEmpty()){
                        continue;
                    }
                    parentheses.pop();
                }
            }
            if(parentheses.isEmpty()){
                System.out.println("Line " + (i+1) + " is valid");
            } else {
                System.out.println("Line " + (i+1) + " is not valid");
            }
            parentheses.clear();
        }
    }
}
