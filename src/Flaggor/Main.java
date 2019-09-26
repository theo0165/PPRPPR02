package Flaggor;

import Flaggor.Flags.Flag;

import Flaggor.Flags.Italy;
import Flaggor.Flags.Sweden;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.ArrayList;

/*
Flaggor:
Sverige
Italien
 */

public class Main extends Application {
    private static ArrayList<Flag> flags = new ArrayList<>();
    public static BorderPane mainLayout = new BorderPane();

    /**
     * Launch program
     * @param args
     */
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Flaggor");

        mainLayout.setTop(getButtonPane());
        mainLayout.setCenter(getWelcomeText());

        Scene scene = new Scene(mainLayout, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static HBox getButtonPane(){
        HBox buttonPane = new HBox();

        Button[] buttons = {
                new Button("Sverige"),
                new Button("Italien"),
                new Button("Flagga 3"),
                new Button("Flagga 4")
        };

        for (Button button : buttons) {
            if(button.getText() == "Sverige"){
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        setFlag(new Sweden());
                    }
                });
            }else if(button.getText() == "Italien"){
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        setFlag(new Italy());
                    }
                });
            }
        }

        HBox box = new HBox(30);
        box.getChildren().addAll(buttons);

        buttonPane.getChildren().add(box);
        buttonPane.setAlignment(Pos.CENTER);

        return buttonPane;
    }

    private static Text getWelcomeText(){
        Text txt = new Text("Welcome! Choose flag!");
        txt.setFont(Font.font("Monserrat", FontWeight.BOLD, FontPosture.REGULAR, 50));
        txt.setTextAlignment(TextAlignment.CENTER);
        return txt;
    }

    private static void setFlag(Flag flag){
        
    }
}