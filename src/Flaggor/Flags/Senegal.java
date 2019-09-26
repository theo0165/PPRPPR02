package Flaggor.Flags;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Senegal extends Flag {
    @Override
    public String getName() {
        return "Senegal";
    }

    @Override
    public Node renderFlag() {
        StackPane flagContainer = new StackPane();

        Rectangle green = new Rectangle();
        green.setWidth(133);
        green.setHeight(200);
        green.setFill(Color.rgb(0, 150, 57));
        green.setTranslateX(-133);
        green.setTranslateY(0);

        Rectangle yellow = new Rectangle();
        yellow.setWidth(133);
        yellow.setHeight(200);
        yellow.setFill(Color.rgb(255, 209, 0));
        yellow.setTranslateX(0);
        yellow.setTranslateY(0);

        Rectangle red = new Rectangle();
        red.setWidth(133);
        red.setHeight(200);
        red.setFill(Color.rgb(239, 51, 64));
        red.setTranslateX(133);
        red.setTranslateY(0);


        Polygon star = new Polygon();
        star.setFill(Color.rgb(0, 150, 57));
        star.setTranslateX(0);
        star.setTranslateY(0);
        star.getPoints().addAll(new Double[]{
                65.0,  50.0,
                40.0,  120.0,
                100.0, 78.0,
                30.0,  78.0,
                85.0,  120.0
        });
        //TODO: Flaggan är sne som fan

        flagContainer.getChildren().add(green);
        flagContainer.getChildren().add(yellow);
        flagContainer.getChildren().add(red);
        flagContainer.getChildren().add(star);

        return flagContainer;
    }
}
