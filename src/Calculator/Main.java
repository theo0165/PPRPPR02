package Calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
    1   2   3   +
    4   5   6   -
    7   8   9   *
    C   0   =   /
    %   ,   sqrt

    -----------------

    1   2   3   +   %
    4   5   6   -   sqrt
    7   8   9   *   ,
    C   0   =   /

    ------------------

    1   2   3   +
    4   5   6   -
    7   8   9   *
    C   0   ,   /
    %   sqr =
 */

public class Main extends Application {
    public static void main(String[] args){ launch(args); }

    @Override
    public void start(Stage pStage){
        pStage.setTitle("Calculator");

        Interface ui = new Interface();
        Scene scene = new Scene(ui.getInterface(), 400, 600);
        pStage.setScene(scene);
        pStage.show();
    }
}
