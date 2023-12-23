import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2_218 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        Scanner inp = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        readAndValidateInput(inp, nums);

        inp.close();
        Collections.sort(nums);
        printSortedNumbers(nums);
    }

    private static void readAndValidateInput(Scanner inp, List<Integer> nums) {
        while (nums.size() < MAX) {
            String s = inp.nextLine();

            try {
                int num = Integer.parseInt(s);

                if (isValidRange(num)) {
                    nums.add(num);
                } else {
                    System.out.println("Invalid range! Try again!");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again!");
            }
        }
    }

    private static boolean isValidRange(int num) {
        return num >= 0 && num <= 10;
    }

    private static void printSortedNumbers(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }
}
