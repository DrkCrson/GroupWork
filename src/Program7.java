
import java.util.*;

public class Program7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in an Array Legnth: ");
        int length = input.nextInt();
        int[] array = new int[length];
        array = getValues(array);
        System.out.print("Avgerage :" + getAvg(array));
        printArray(array);
    }

    public static int[] getValues(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < array.length; ++x) {
            System.out.print("Please enter the value! :");
            array[x] = input.nextInt();
        }
        return array;
    }

    public static double getAvg(int[] array) {
        double avg = 0;
        for (int x = 0; x < array.length; ++x) {
            avg += array[x];
        }
        avg = avg / array.length;
        return avg;
    }

    public static void printArray(int[] array) {
        System.out.print("Array: " + Arrays.toString(array));
    }
}
