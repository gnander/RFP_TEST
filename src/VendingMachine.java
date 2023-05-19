import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private static int[] notes = {2000, 1000, 500, 100, 50, 10, 5, 2, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the change amount in Rs: ");
        int change = scanner.nextInt();
        scanner.close();

        List<Integer> result = calculateMinimumNotes(change);

        System.out.println("Minimum number of notes needed: " + result.size());
        System.out.println("Notes to be returned: " + result);
    }

    private static List<Integer> calculateMinimumNotes(int amount) {
        List<Integer> result = new ArrayList<>();

        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount %= note;
                for (int i = 0; i < count; i++) {
                    result.add(note);
                }
            }
        }

        return result;
    }
}
