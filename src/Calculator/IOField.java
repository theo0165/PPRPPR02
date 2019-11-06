package Calculator;

import javafx.scene.control.TextField;

public class IOField {
    public static TextField ioField = new TextField();

    public static TextField getIoField(){
        return ioField;
    }

    public static void addToField(String toAdd){
        ioField.setText(ioField.getText() + toAdd);
    }

    public static void removeFromField(){
        if(ioField.getText().length() > 0) ioField.setText(ioField.getText().substring(0, ioField.getText().length() - 1));
    }

    public static void calculateField(){}
}
