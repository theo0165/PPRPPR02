package Flaggor.Flags;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Sweden extends Flag {
    @Override
    public String getName() {
        return "Sweden";
    }

    @Override
    public Node renderFlag() {
        StackPane flagContainer = new StackPane();
        flagContainer.setAlignment(Pos.CENTER);

        Rectangle blue = new Rectangle();
        blue.setWidth(400);
        blue.setHeight(200);
        blue.setFill(Color.rgb(0, 127, 229));

        Rectangle y1 = new Rectangle();
        y1.setWidth(40);
        y1.setHeight(200);
        y1.setTranslateY(0);
        y1.setTranslateX(-50);
        y1.setFill(Color.rgb(255, 204, 0));

        Rectangle y2 = new Rectangle();
        y2.setWidth(400);
        y2.setHeight(40);
        y2.setTranslateY(0);
        y2.setTranslateX(0);
        y2.setFill(Color.rgb(255, 204, 0));

        flagContainer.getChildren().add(blue);
        flagContainer.getChildren().add(y1);
        flagContainer.getChildren().add(y2);

        return flagContainer;
    }
}
