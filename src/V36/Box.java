package V36;

import java.util.ArrayList;
import java.util.Arrays;

public class Box {
    // 4. Skapa en klass Box som tar in ett okänt antal objekt och lagrar dem.
    public ArrayList<Object> store = new ArrayList<>();

    public Box(Object... items){
        store.addAll(Arrays.asList(items));
    }

    public boolean compare(Box boxToCheck){
        // 5. Skapa en metod i klassen Box som kan jämföra ifall två stycken Boxar innehåller samma datatyp.*
        boolean sameDataType = false;
        for(Object item : store){
            for(Object toCompare : boxToCheck.store){
                if(item.getClass().equals(toCompare.getClass())){
                    sameDataType = true;
                    break;
                }
            }
        }

        return sameDataType;
    }
}
