import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rnd = new Random();

        System.out.println("Array size: ");
        int n = sc.nextInt();
        System.out.println("Key value: ");
        int key = sc.nextInt();
        int[] intArray = new int[n];


        arrayMethods.fill(intArray, 20);
        arrayMethods.print(intArray);
        arrayMethods.sort(intArray);
        arrayMethods.print(intArray);
        int output = arrayMethods.search(intArray, key, 0, n-1);
        System.out.println(output);
        sc.close();
    }
}
