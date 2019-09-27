package Flaggor.Flags;

import javafx.scene.Node;

/**
 * Base class for flag
 */
public abstract class Flag {
    /**
     * Define and return name of flag
     * @return Flag/Country name (String)
     */
    public String getName() { return ""; }

    /**
     * Abstract method to generate and return flag image
     * @return Flag image (javafx.scene.Node)
     */
    public abstract Node renderFlag();
}
