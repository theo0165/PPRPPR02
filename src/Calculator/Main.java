package Calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args){ launch(args); }

    @Override
    public void start(Stage pStage){
        pStage.setTitle("Calculator");

        Interface ui = new Interface();
        Scene scene = new Scene(ui.getInterface(), 400, 600);
        pStage.setResizable(false);
        pStage.setScene(scene);
        pStage.show();
    }
}
