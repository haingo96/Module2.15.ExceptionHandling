import java.util.Arrays;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(myArr));

        Scanner scn = new Scanner(System.in);
        System.out.println("Input index to check:");
        int input = scn.nextInt();

        try {
            System.out.println(myArr[input]);
        } catch (Exception e) {
            System.out.println("hello mf!");
        }
    }
}
