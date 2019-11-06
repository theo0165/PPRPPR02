package Calculator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.regex.Pattern;

public class IOField {
    public static TextField ioField = new TextField();

    public static TextField getIoField(){
        return ioField;
    }

    public static void addToField(String toAdd){
        ioField.setText(ioField.getText() + toAdd);
    }

    public static void removeFromField(){ ioField.setText(ioField.getText().substring(0, ioField.getText().length() - 1)); }

    public static void calculateField(){}
}
