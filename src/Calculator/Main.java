package Calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
    private static BorderPane mainLayout = new BorderPane();

    public static void main(String[] args){ launch(args); }

    @Override
    public void start(Stage pStage){
        pStage.setTitle("Calculator");

        mainLayout.setTop(IOField.getIOField());
        mainLayout.setCenter(getButtonPane());

        Scene scene = new Scene(mainLayout, 400, 600);
        pStage.setScene(scene);
        pStage.show();
    }

    private static GridPane getButtonPane(){
        Button[] buttons = {
            new Button("1"), new Button("2"), new Button("3"), new Button("+"),
            new Button("4"), new Button("5"), new Button("6"), new Button("-"),
            new Button("7"), new Button("8"), new Button("9"), new Button("*"),
            new Button("C"), new Button("0"), new Button("="), new Button("/"),
            new Button("%"), new Button(","), new Button("√")
        };

        for(Button button:buttons){
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if(button.getText() != "=") {
                        IOField.addToField(button.getText());
                    }else{
                        IOField.calculateField();
                    }
                }
            });
        }

        GridPane buttonPane = new GridPane();

        // 1 2 3 +
        HBox rowOne = new HBox();
        rowOne.getChildren().addAll(buttons[0], buttons[1], buttons[2], buttons[3]);
        buttonPane.add(rowOne, 0, 0);

        // 4 5 6 -
        HBox rowTwo = new HBox();
        rowTwo.getChildren().addAll(buttons[4], buttons[5], buttons[6], buttons[7]);
        buttonPane.add(rowTwo, 0, 1);

        // 7 8 9 *
        HBox rowThree = new HBox();
        rowThree.getChildren().addAll(buttons[8], buttons[9], buttons[10], buttons[11]);
        buttonPane.add(rowThree, 0, 2);

        // C 0 = /
        HBox rowFour = new HBox();
        rowFour.getChildren().addAll(buttons[12], buttons[13], buttons[14], buttons[15]);
        buttonPane.add(rowFour, 0, 3);

        // % , √
        HBox rowFive = new HBox();
        rowFive.getChildren().addAll(buttons[16], buttons[17], buttons[18]);
        buttonPane.add(rowFive, 0, 4);

        return buttonPane;
    }
}
