package fundamentals.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainTask2 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the message:");
        String[] ar = scanner.nextLine().split(" ");
        Collections.reverse(Arrays.asList(ar));
        StringBuilder output = new StringBuilder("Reverse line:");
        for (String word : ar){
            output.append(" ").append(word);
        }
        System.out.print(output.toString().trim());
    }
}
