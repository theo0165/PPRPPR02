package Calculator;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

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
        char[] ioTextChar = ioText.toCharArray();
        ArrayList<String> eqArray = new ArrayList<>();


        int last = 0;
        for(int i=0; i<ioField.getText().length(); i++){
            char current = ioText.charAt(i);

            if(current == '+' || current == '-' || current == '*' || current == '/' || current == '√'){

            }
        }

        System.out.println(eqArray);
    }
}
