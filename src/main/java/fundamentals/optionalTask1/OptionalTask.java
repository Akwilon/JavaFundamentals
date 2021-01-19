package fundamentals.optionalTask1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OptionalTask {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the numbers:");
        String[] ar = scanner.nextLine().split(" ");
        String min = findMin(ar);
        String max = findMax(ar);
        System.out.println("Max value: " + max + "\n" + "Max value length: " + max.length()
                + "\n" + "Min value: " + min + "\n" + "Min value length: " + min.length());
        System.out.println("Numbers length ASC: ");
        for (String out: lengthAsc(ar)){
            System.out.println(out);
        }

        System.out.println("Numbers length DESC: ");
        for (String out: lengthDesc(ar)){
            System.out.println(out);
        }

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


    private static String[] lengthAsc(String[] ar){
        String[] out = new String[ar.length];
        List<String> res = Arrays.stream(ar).sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).collect(Collectors.toList());
       return res.toArray(out) ;
    }

    private static String[] lengthDesc(String[] ar){
        String[] out = lengthAsc(ar);
        Collections.reverse(Arrays.asList(out));
        return out;
    }



}
