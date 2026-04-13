import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                String[] numbers = new String[N];
                for (int i = 0; i < N; i++) {
                        numbers[i] = sc.next();
                }
                sc.close();

                // Sort the strings using a custom comparator
                // Comparator logic: (str1, str2) -> (str2 + str1).compareTo(str1 + str2)
                Arrays.sort(numbers, (str1, str2) -> (str2 + str1).compareTo(str1 + str2));

                // Handle edge case where all numbers are "0"
                if (numbers[0].equals("0")) {
                        System.out.println("0");
                        return;
                }

                // Concatenate sorted strings and print
                StringBuilder result = new StringBuilder();
                for (String num : numbers) {
                        result.append(num);
                }
                System.out.println(result.toString());
        }
}
