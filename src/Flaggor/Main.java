package Flaggor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
Flaggor:
Sverige
Italien
 */

public class Main extends Application {
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

        BorderPane paneLayout = new BorderPane();

        paneLayout.setTop(getButtonPane());

        Scene scene = new Scene(paneLayout, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static javafx.scene.layout.HBox getButtonPane(){
        HBox buttonPane = new HBox();

        Button[] buttons = {
                new Button("Sverige"),
                new Button("Italien"),
                new Button("Flagga 3"),
                new Button("Flagga 4")
        };

        buttonPane.getChildren().addAll(buttons);

        return buttonPane;
    }
}
