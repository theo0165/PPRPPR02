package Calculator;

import Calculator.Functions.*;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class IOField {
    private static TextField ioField = new TextField();

    public static TextField getIoField(){
        return ioField;
    }

    public static void addToField(String toAdd){
        if(ioField.getText().length() > 0){
            ioField.setText(ioField.getText() + toAdd);
        }else if(toAdd != "+" && toAdd != "-" && toAdd != "*" && toAdd != "." && toAdd != "/" && toAdd != "%"){ //Dissallow adding to operators after each other
            ioField.setText(ioField.getText() + toAdd);
        }
    }

    public static void removeFromField(){
        //Checks if ioField is larger than 1 characters and removing last character
        if(ioField.getText().length() > 0) ioField.setText(ioField.getText().substring(0, ioField.getText().length() - 1));
    }

    public static void calculateField(){
        String ioText = ioField.getText();

        if(ioText.length() > 0 && checkIfValidOperation(ioText)){
            float result = 0;

            //Split equation and keep delimiters
            String SPLIT_REGEX =
                    "(((?<=\\+)|(?=\\+))" +
                    "|((?<=\\-)|(?=\\-))" +
                    "|((?<=\\*)|(?=\\*))" +
                    "|((?<=\\/)|(?=\\/))" +
                    "|((?<=\\%)|(?=\\%))" +
                    "|((?<=\\√)|(?=\\√)))";
            String[] splitEqArray = ioText.split(SPLIT_REGEX);
            ArrayList<String> splitEq = new ArrayList<>(Arrays.asList(splitEqArray));

            // Add first number to result, if eq is 1+1, +1 will be left in splitEq
            result += Float.parseFloat(splitEq.get(0));
            splitEq.remove(0);

            //Go through splitEq and calculate result
            while(splitEq.size() > 0){
                String current = splitEq.get(0);

                switch (current){
                    case "+":
                        result = new Addition().parseEquation(result, splitEq.get(1));;

                        //Remove eq operator and number
                        splitEq.remove(1);
                        splitEq.remove(0);

                        break;
                    case "-":
                        result = new Subtraction().parseEquation(result, splitEq.get(1));;

                        splitEq.remove(1);
                        splitEq.remove(0);

                        break;
                    case "*":
                        result = new Multiplication().parseEquation(result, splitEq.get(1));;

                        splitEq.remove(1);
                        splitEq.remove(0);

                        break;
                    case "/":
                        result = new Division().parseEquation(result, splitEq.get(1));;

                        splitEq.remove(1);
                        splitEq.remove(0);

                        break;
                    case "%":
                        result = new Modulus().parseEquation(result, splitEq.get(1));;

                        splitEq.remove(1);
                        splitEq.remove(0);

                        break;
                    case "√":
                        result = new SquareRoot().parseEquation(result, splitEq.get(1));;

                        splitEq.remove(1);
                        splitEq.remove(0);

                        break;
                }
            }

            ioField.setText(String.valueOf(result));
        }else{
            //Alert if math operation is invalid
            new Alert(Alert.AlertType.ERROR, "Invalid math operation", ButtonType.OK).showAndWait();
        }
    }

    private static boolean checkIfValidOperation(String op){
        boolean isValid = true;

        //Checks if multiple operators are present directly after each other, ex. 1++1. If true operation is invalid
        char lastChar = ' ';
        for(char c:op.toCharArray()){
            if((c == '+' || c == '-' || c == '*' || c == '/' || c == '%' || c == '√') && c == lastChar){
                isValid = false;
            }

            lastChar = c;
        }

        //Checks if first or last char is an operator, if true operation is invalid
        switch(op.charAt(0)){
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
            case '√':
                System.out.println("FIRST CHAR");
                isValid = false;
        }

        switch(op.charAt(op.length() - 1)){
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
            case '√':
                System.out.println("LAST CHAR");
                isValid = false;
        }

        return isValid;
    }
}
