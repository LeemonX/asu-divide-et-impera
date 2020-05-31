import java.util.Random;
import java.util.Scanner;

public class arrayMethods
{

    public static void sort (int[] arr)
    {
        for (int inc = arr.length / 2; inc >= 1; inc = inc / 2)
            for (int step = 0; step < inc; step++)
                insertionSort (arr, step, inc);
    }

    private static void insertionSort (int[] arr, int start, int inc)
    {
        int tmp;
        for (int i = start; i < arr.length - 1; i += inc)
            for (int j = Math.min(i+inc, arr.length-1); j-inc >= 0; j = j-inc)
                if (arr[j - inc] > arr[j])
                {
                    tmp = arr[j];
                    arr[j] = arr[j-inc];
                    arr[j-inc] = tmp;
                }
                else break;
    }

    public static void print(int[] arr){
        for(int i : arr)
            System.out.print(i + "\t");
        System.out.println();
    }

    public static void fill(int[] arr){
        Scanner num = new Scanner(System.in);

        System.out.println("Enter '0' for manual input");
        if (num.nextInt() == 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Element: " + i);
                arr[i] = num.nextInt();
            }
        }
        else{
            Random rnd = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(20);
            }
        }
        num.close();
    }


    public static int leftSideSearch(int[] arr, int key){
        int left = -1;
        int right = arr.length;
        while (left < right -1){
            int mid = (left + right)/2;
            if (arr[mid] < key)
                left = mid;
            else
                right = mid;
        }
        if(arr[right] == key)
            return right;
        else
            return -1;
    }

    public static int rightSideSearch(int[] arr, int key){
        int left = 0;
        int right = arr.length;
        while (left < right -1){
            int mid = (left + right)/2;
            if (arr[mid] <= key)
                left = mid;
            else
                right = mid;
        }
        if(arr[right-1] == key)
            return right-1;
        else
            return -1;
    }
}
