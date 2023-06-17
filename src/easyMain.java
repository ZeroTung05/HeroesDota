import java.util.ArrayList;
import java.util.Arrays;

public class easyMain {
    public static void main(String[] args) {
        boolean hasHero = false;
        ArrayList<String> heroes = new ArrayList<>(Arrays.asList(
                "Lina","Luna","Pangoler","Pudge","DarkSeer","Slark","Chen"
        ));

        Character mustPreLastChar = 'e';
        Character mustLastChar = 'r';

        for (int i = 0; i < heroes.size() ; i++) {

            // текущий герой
            String currentHero = heroes.get(i);
            // достаем последнюю букву имени героя
            Character lastChar = currentHero.charAt(currentHero.length()-1);
            // достаем ПРЕДпоследнюю букву имени героя
            Character preLastChar = currentHero.charAt(currentHero.length()-2);


            // если первая и предпоследняя буквы "er"
            if (lastChar.equals(mustLastChar) && preLastChar.equals(mustPreLastChar)) {

                // если герой уже хотя бы один был найден
                if (!hasHero) hasHero = true;
                System.out.println(heroes.get(i));
            }
        }

        // если таких не оказалось, то выводим, что таких нет
        if (!hasHero){
            System.out.println("No heroes with such name ends with “er”");
        }
    }
}