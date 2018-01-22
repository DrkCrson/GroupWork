
import java.util.Scanner;

import java.util.Arrays;

public class C7_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 10 Numbers: ");
        double array[] = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.print("Smallest Number is: " + small(array));
    }

    public static double small(double array[]) {
        Arrays.sort(array);
        double small = array[0];
        return small;
    }

}
