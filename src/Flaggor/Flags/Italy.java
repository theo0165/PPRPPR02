package Flaggor.Flags;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Italy extends Flag {
    @Override
    public String getName() { return "Italy"; }

    @Override
    public Node renderFlag() {
        StackPane flagContainer = new StackPane();
        flagContainer.setAlignment(Pos.CENTER);

        Rectangle green = new Rectangle();
        green.setWidth(133);
        green.setHeight(200);
        green.setFill(Color.rgb(0, 122, 51));
        green.setTranslateX(-133);
        green.setTranslateY(0);

        Rectangle white = new Rectangle();
        white.setWidth(133);
        white.setHeight(200);
        white.setFill(Color.WHITE);
        white.setTranslateX(0);
        white.setTranslateY(0);

        Rectangle red = new Rectangle();
        red.setWidth(133);
        red.setHeight(200);
        red.setFill(Color.rgb(203, 51, 59));
        red.setTranslateX(133);
        red.setTranslateY(0);

        flagContainer.getChildren().add(green);
        flagContainer.getChildren().add(white);
        flagContainer.getChildren().add(red);

        return flagContainer;
    }
}
