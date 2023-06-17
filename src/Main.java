import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        boolean hasHero = false;
        ArrayList<String> heroes = new ArrayList<>(Arrays.asList("Lina","Luna","Pangoler","Pudge","DarkSeer","Slark","Chen"));
        ArrayList<Character> first = new ArrayList<>(Arrays.asList('e'));
        ArrayList<Character> second = new ArrayList<>(Arrays.asList('r'));
        for (int i = 0; i <heroes.size() ; i++) {
            if (second.contains(heroes.get(i).charAt(heroes.get(i).length()-1))) {
                if (first.contains(heroes.get(i).charAt(heroes.get(i).length() - 2))) {
                    hasHero = true;
                    System.out.println(heroes.get(i));
                }
            }
        }
        if (!hasHero){

                System.out.println("No heroes with such name ends with “er”");
        }
    }
}