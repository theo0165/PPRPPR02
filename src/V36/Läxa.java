package V36;

public class Läxa {
    public static void main(String[] args){
        sum(1, 3, 5, 6, 7);
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

    public static void anagram(String text, String text2){
        if(text.length() == 0){
            System.out.println(text2);
        }

        for (int i = 0; i<text.length(); i++) {
            anagram(text.substring(0, i) + text.substring(i+1, text.length()), text.charAt(i) + text2);
        }
    }
}
