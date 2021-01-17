package fundamentals.task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainTask4 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the numbers:");
        String[] ar = scanner.nextLine().split(" ");
        int summ = 0;
        int mult = 1;
        for (String word : ar){
            int num = Integer.parseInt(word);
           summ += num;
            mult *= num;
        }
        System.out.println("Summary: " + summ);
        System.out.println("Multiplication: " + mult);
    }

}
