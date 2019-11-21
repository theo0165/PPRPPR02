package Calculator;

import Calculator.Functions.Addition;
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
        }else if(toAdd != "+" && toAdd != "-" && toAdd != "*" && toAdd != "." && toAdd != "/" && toAdd != "%"){
            ioField.setText(ioField.getText() + toAdd);
        }
    }

    public static void removeFromField(){
        if(ioField.getText().length() > 0) ioField.setText(ioField.getText().substring(0, ioField.getText().length() - 1));
    }

    public static void calculateField(){
        String ioText = ioField.getText();

        if(checkIfValidOperation(ioText)){

        }else{
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
