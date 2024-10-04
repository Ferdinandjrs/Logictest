import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one line of words (S): ");
        String input = scanner.nextLine().toLowerCase();

        List<Character> vowel = new ArrayList<>();
        List<Character> consonant = new ArrayList<>();

        for (char character : input.toCharArray()) {
            if (Character.isLetter(character)) {
                if ("aeiou".indexOf(character) >= 0) {
                    vowel.add(character);
                } else {
                    consonant.add(character);
                }
            }
        }
        Collections.sort(vowel);


        System.out.print("Vowel Characters : " );
        for (Character Vowel : vowel) {
            System.out.print(Vowel);
        }

        System.out.print("\nConsonant Characters : " );
        for (Character Consonant : consonant) {
            System.out.print(Consonant);
        }

        scanner.close();
    }
}
