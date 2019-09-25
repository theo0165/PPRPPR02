package V38;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFX extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();

        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(100.0);
        circle.setFill(Color.RED);

        Group root = new Group(circle);

        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("Jävligt coola flaggor...");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
