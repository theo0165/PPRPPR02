package Flaggor.Flags;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Madagascar extends Flag {
    @Override
    public String getName() {
        return "Madagascar";
    }

    @Override
    public Node renderFlag() {
        StackPane flagContainer = new StackPane();

        Rectangle white = new Rectangle();
        white.setWidth(100);
        white.setHeight(200);
        white.setFill(Color.WHITE);
        white.setTranslateX(-150);
        white.setTranslateY(0);

        Rectangle red = new Rectangle();
        red.setWidth(300);
        red.setHeight(100);
        red.setFill(Color.rgb(249, 66, 58));
        red.setTranslateX(50);
        red.setTranslateY(-50);

        Rectangle green = new Rectangle();
        green.setWidth(300);
        green.setHeight(100);
        green.setFill(Color.rgb(0, 132, 61));
        green.setTranslateX(50);
        green.setTranslateY(50);

        flagContainer.getChildren().add(white);
        flagContainer.getChildren().add(red);
        flagContainer.getChildren().add(green);

        return flagContainer;
    }
}
