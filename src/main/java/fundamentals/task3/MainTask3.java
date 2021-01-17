package fundamentals.task3;

import java.util.Random;
import java.util.Scanner;

public class MainTask3 {

    public static void main(String[] args) {
        System.out.println("Put nums value: ");
        int value = new Scanner(System.in).nextInt();
        Random random = new Random();
        System.out.println("Random numbers in one line: ");
        int i = value;
        while (i > 0) {
            System.out.print(" " + random.nextInt(250));
            i--;
        }
        System.out.println("\n" + "Random numbers on each line: ");
        int j = value;
        while (j > 0) {
            System.out.println(random.nextInt(250));
            j--;
        }
    }
}
