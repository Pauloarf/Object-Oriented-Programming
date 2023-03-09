import java.util.Arrays;
import java.util.Scanner;

public class File2 {
    public static void main(String[] args) {
        int array_size = 8;
        int [] arr = new int[array_size];
        Scanner input = new Scanner(System.in);

        System.out.println("Array has size 8 by default:");
        System.out.println("Input the values for the Array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }


        System.out.println(Arrays.toString(arr));

        File2Functions file2Functions = new File2Functions();
    }
}