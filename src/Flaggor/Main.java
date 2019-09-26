package Flaggor;

import Flaggor.Flags.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

/*
Flaggor:
Sverige
Italien
Senegal
 */

public class Main extends Application {
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
        mainLayout.setStyle("-fx-background-color: #2c2c54;");

        Scene scene = new Scene(mainLayout, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static HBox getButtonPane(){
        HBox buttonPane = new HBox();

        Button[] buttons = {
                new Button("Sweden"),
                new Button("Italy"),
                new Button("Senegal"),
                new Button("Madagascar")
        };

        for (Button button : buttons) {
            if(button.getText() == "Sweden"){
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        setFlag(new Sweden());
                    }
                });
            }else if(button.getText() == "Italy"){
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        setFlag(new Italy());
                    }
                });
            }else if(button.getText() == "Senegal"){
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        setFlag(new Senegal());
                    }
                });
            }else if(button.getText() == "Madagascar"){
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        setFlag(new Madagascar());
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
        txt.setFill(Color.WHITE);
        return txt;
    }

    private static void setFlag(Flag flag){
        BorderPane flagBox = new BorderPane();
        StackPane flagNameContainer = new StackPane();
        Text flagName = new Text(flag.getName());

        flagName.setFont(Font.font("Monserrat", FontWeight.BOLD, FontPosture.REGULAR, 30));
        flagName.setTextAlignment(TextAlignment.CENTER);
        flagName.setFill(Color.WHITE);

        flagNameContainer.setAlignment(Pos.CENTER);
        flagNameContainer.getChildren().add(flagName);
        flagBox.setTop(flagNameContainer);

        flagBox.setCenter(flag.renderFlag());

        mainLayout.setCenter(flagBox);
    }
}
