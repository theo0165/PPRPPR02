package Calculator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.regex.Pattern;

public class IOField {
    private static TextField ioField = new TextField();

    public static VBox getIOField(){
        VBox ioBox = new VBox();
        ioField.setPrefHeight(50);
        ioField.setAlignment(Pos.CENTER_RIGHT);

        //Check textfield on change (new input)
        ioField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(!Pattern.matches(newValue, "^(\\d|\\+|\\-|\\*|\\/|\\(|\\)|\\%|sqrt|\\√|\\,)*$")){ //Check for only numbers and math characters
                    ioField.setText(newValue.replaceAll("[^(\\d|\\+|\\-|\\*|\\/|\\(|\\)|\\%|sqrt|\\√|\\,)]$", "")); //Replace any non numbers and math characters
                }
            }
        });

        //√
        ioBox.getChildren().add(ioField);

        return ioBox;
    }

    public static TextField getIoField(){
        return ioField;
    }

    public static void addToField(String toAdd){
        ioField.setText(ioField.getText() + toAdd);
    }

    public static void removeFromField(){}

    public static void calculateField(){}
}
