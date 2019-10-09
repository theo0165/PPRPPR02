package Calculator;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.regex.Pattern;

public class Main extends Application {
    private static BorderPane mainLayout = new BorderPane();

    public static void main(String[] args){ launch(args); }

    @Override
    public void start(Stage pStage){
        pStage.setTitle("Calculator");

        mainLayout.setTop(getIOField());

        Scene scene = new Scene(mainLayout, 400, 600);
        pStage.setScene(scene);
        pStage.show();
    }

    private static VBox getIOField(){
        VBox ioBox = new VBox();
        TextField ioField = new TextField();
        ioField.setPrefHeight(50);
        ioField.setAlignment(Pos.CENTER_RIGHT);

        ioField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(Pattern.matches(newValue, "^(\\d|\\+|\\-|\\*|\\/|\\(|\\)|\\^|\\%|sqrt)*$")){
                    ioField.setText(newValue.replaceAll("[^(\\d|\\+|\\-|\\*|\\/|\\(|\\)|\\^|\\%|sqrt)]", ""));
                }
            }
        });

        ioBox.getChildren().add(ioField);

        return ioBox;
    }
}
