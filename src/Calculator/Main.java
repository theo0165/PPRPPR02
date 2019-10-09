package Calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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

        ioBox.getChildren().add(ioField);

        return ioBox;
    }
}
