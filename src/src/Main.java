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


        arrayMethods.fill(intArray);
        arrayMethods.print(intArray);
        arrayMethods.sort(intArray);
        arrayMethods.print(intArray);
        int leftOutput = arrayMethods.leftSideSearch(intArray, key);
        int rightOutput = arrayMethods.rightSideSearch(intArray, key);
        System.out.println("Result of left-side search: " + leftOutput);
        System.out.println("Result of right-side search: " + rightOutput);
        int finalLen = rightOutput-leftOutput+1;
        if(rightOutput != -1)
            System.out.println("Woah, we have a " + finalLen + " of " + intArray[leftOutput] + " in a row");
        sc.close();
    }
}
