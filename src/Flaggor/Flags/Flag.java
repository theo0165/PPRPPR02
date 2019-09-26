package Flaggor.Flags;

import javafx.scene.Node;

public abstract class Flag {
    public String getName(){ return ""; }
    public abstract Node renderFlag(float xCord, float yCord, float size);
}
