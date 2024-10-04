import java.util.Arrays;
import java.util.Scanner;

public class PSBB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of families: ");
        int numberfamilies = scanner.nextInt();

        int[] familymembers = new int[numberfamilies];
        System.out.print("Input the number of members in the family (separated by a space): ");
        for (int i = 0; i < numberfamilies; i++) {
            familymembers[i] = scanner.nextInt();
        }

        if (familymembers.length != numberfamilies) {
            System.out.println("Input must be equal with count of family");
        }

        Arrays.sort(familymembers);

        int left = 0;
        int right = familymembers.length - 1;
        int buses = 0;


        while (left <= right) {
            if (familymembers[left] + familymembers[right] <= 4) {
                left++;
            }
            right--;
            buses++;
        }

        System.out.println("Minimum bus required is: " + buses);

        scanner.close();
    }
}

