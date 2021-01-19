package fundamentals.optionalTask1;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the numbers:");
        String[] ar = scanner.nextLine().split(" ");
        String min = findMin(ar);
        String max = findMax(ar);
        System.out.println("Max value: " + max + "\n" + "Max value length: " + max.length()
                + "\n" + "Min value: " + min + "\n" + "Min value length: " + min.length());
    }


    private static String findMin(String[] arr) {
        return Arrays.stream(arr).min((str1, str2) ->
                Integer.compare(Integer.parseInt(str1), Integer.parseInt(str2)))
                .get();
    }

    private static String findMax(String[] arr) {
        return Arrays.stream(arr).max((str1, str2) ->
                Integer.compare(Integer.parseInt(str1), Integer.parseInt(str2)))
                .get();
    }


}
