package V36;

import java.util.ArrayList;
import java.util.Scanner;

public class Läxa {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //System.out.println(sum(1, 2, 3));
        //ReturnArray(1, 2, 3, 4);

        Box box = new Box(1, "hej");
        Box box2 = new Box(true, false, true);

        System.out.println(box.compare(box2));
    }

    public static int sum(int... inputs){
        // 1. Skapa en metod som tar in ett okänt antal heltal och returnerar deras summa.
        int sum = 0;

        for(int number : inputs){
            sum += number;
        }

        return sum;
    }

    public static String reverse(String input){
        // 2. Skapa en rekursiv metod som tar in en sträng och returnerar den baklänges.
        if(input.isEmpty()){
            return input;
        }else{
            return reverse(input.substring(1)) + input.charAt(0);
        }
    }

    public static <T> T[] ReturnArray(T... items){
        // 3. Skapa en generisk metod som tar in ett okänt antal objekt och returnerar en array av dem.
        return items;
    }

    public static String[] anagram(String text){
        // 6. Skapa en rekursiv metod som tar in ett ord och skriver ut alla anagram av ordet.*
        return ;
    }
}
