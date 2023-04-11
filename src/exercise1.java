import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        try {
            printTriangleSide(1,1,1);
            System.out.println("finished print");
        } catch (IllegalTriangleException e) {
            System.out.println("Invalid triangle");
        }
        System.out.println("End program");

    }

    private static void printTriangleSide(int i, int i1, int i2) throws IllegalTriangleException {
        if (!isTriangle(i, i1, i2))
            throw new IllegalTriangleException();
        System.out.printf("Triangle{%s, %s, %s} \n", i, i1, i2);
    }

    private static boolean isTriangle(int i, int i1, int i2) {
        boolean isTriangleInequalityVerified = Math.abs(i1 - i2) < i && i < i1 + i2;
        if (i <= 0 || i1 <= 0 || i2 <= 0) return false;
        else return isTriangleInequalityVerified;
    }
}
