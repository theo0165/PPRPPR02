package Flaggor;

import Flaggor.Flags.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * Main class for JavaFX program that paints out flags.
 */
public class Main extends Application {
    public static BorderPane mainLayout = new BorderPane();

    /**
     * Launch program
     * @param args
     */
    public static void main(String[] args){ launch(args); }

    /**
     * Start program, set scene and create window
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Flags");

        //Add button pane to top position of BorderPane
        mainLayout.setTop(getButtonPane());

        //Add welcome text to center position of BorderPane (will be replaced by flag once button is pressed)
        mainLayout.setCenter(getWelcomeText());

        //Set background color of program
        mainLayout.setStyle("-fx-background-color: #2c2c54;");

        Scene scene = new Scene(mainLayout, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Generate and return button panel
     * @return Button panel (HBox)
     */
    private static HBox getButtonPane(){
        HBox buttonPane = new HBox();

        Button[] buttons = {
                new Button("Sweden"),
                new Button("Italy"),
                new Button("Senegal"),
                new Button("Madagascar")
        };

        // Go through all buttons and add EventHandlers
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
        buttonPane.setPadding(new Insets(10, 0, 0, 0));

        return buttonPane;
    }

    /**
     * Generate and return welcome text
     * @return Welcome text (Text)
     */
    private static Text getWelcomeText(){
        Text txt = new Text("Welcome! Choose flag!");
        txt.setFont(Font.font("Monserrat", FontWeight.BOLD, FontPosture.REGULAR, 50));
        txt.setTextAlignment(TextAlignment.CENTER);
        txt.setFill(Color.WHITE);
        return txt;
    }

    /**
     * Generate and set flag in main layout
     * @param flag The flag to set (Flags.Flag)
     */
    private static void setFlag(Flag flag){
        BorderPane flagBox = new BorderPane();

        //Needed to create flagNameContainer to make text align at center instead of left
        StackPane flagNameContainer = new StackPane();
        Text flagName = new Text(flag.getName());

        flagName.setFont(Font.font("Monserrat", FontWeight.BOLD, FontPosture.REGULAR, 30));
        flagName.setTextAlignment(TextAlignment.CENTER);
        flagName.setFill(Color.WHITE);

        flagNameContainer.setAlignment(Pos.CENTER);
        flagNameContainer.getChildren().add(flagName);

        //Add padding to top of flag name text to make some space between it and the buttons
        flagNameContainer.setPadding(new Insets(40, 0, 0, 0));
        flagBox.setTop(flagNameContainer);

        flagBox.setCenter(flag.renderFlag());

        mainLayout.setCenter(flagBox);
    }
}
