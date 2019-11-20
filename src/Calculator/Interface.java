package Calculator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.util.regex.Pattern;

public class Interface {
    public static BorderPane mainLayout = new BorderPane();

    public Interface(){
        mainLayout.setTop(createIoField());
        mainLayout.setCenter(createButtonPane());
    }

    public BorderPane getInterface(){
        return mainLayout;
    }

    private static GridPane createButtonPane(){
        GridPane buttonPane = new GridPane();

        Button[] buttons = {
                new Button("1"), new Button("2"), new Button("3"), new Button("+"),
                new Button("4"), new Button("5"), new Button("6"), new Button("-"),
                new Button("7"), new Button("8"), new Button("9"), new Button("*"),
                new Button("C"), new Button("0"), new Button("="), new Button("/"),
                new Button("%"), new Button("."), new Button("√")
        };

        for(Button button:buttons){
            button.setOnAction(event -> {
                if(button.getText() == "=") {
                    IOField.calculateField();
                }else if(button.getText() == "C"){
                    IOField.removeFromField();
                }else{
                    IOField.addToField(button.getText());
                }
            });

            GridPane.setVgrow(button, Priority.ALWAYS);
            GridPane.setHgrow(button, Priority.ALWAYS);

            button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        }

        //buttonPane

        int row = 0;
        int column = 0;
        for(int i=0;i<buttons.length;i++){
            buttonPane.add(buttons[i], column, row);

            //Calculate button row and column index
            column++;
            if((i+1) % 4 == 0){
                row++;
                column = 0;
            }
        }

        return buttonPane;
    }

    public static VBox createIoField(){
        VBox ioBox = new VBox();
        IOField.getIoField().setPrefHeight(50);
        IOField.getIoField().setAlignment(Pos.CENTER_RIGHT);

        //Check textfield on change (new input)
        IOField.getIoField().textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(!Pattern.matches(newValue, "^(\\d|\\+|\\-|\\*|\\/|\\(|\\)|\\%|\\√|\\.)*$")){ //Check for only numbers and math characters
                    IOField.getIoField().setText(newValue.replaceAll("[^(\\d|\\+|\\-|\\*|\\/|\\(|\\)|\\%|\\√|\\.)]$", "")); //Replace any non numbers and math characters
                }
            }
        });

        //√
        ioBox.getChildren().add(IOField.getIoField());

        return ioBox;
    }
}
