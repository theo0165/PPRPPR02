import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class V40 extends Application {
    static Stage stage;
    static Scene scene;
    static BorderPane mainLayout;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        mainLayout = new BorderPane();
        HBox box = new HBox();

        TextField textField = new TextField();
        Text text = new Text();

        box.getChildren().add(textField);
        box.getChildren().add(text);

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            text.setText(newValue);
        });

        mainLayout.setTop(box);

        scene = new Scene(mainLayout, 600, 400);
        stage.setTitle("Text field test");
        stage.setScene(scene);
        stage.show();
    }
}
