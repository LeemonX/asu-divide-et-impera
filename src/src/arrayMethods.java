import java.util.Random;

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

    public static void fill(int[] arr, int bound){
        Random rnd = new Random();
        for(int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt(bound);
    }

    public static int search(int[] arr, int key, int left, int right){
        if (left >= right)
            return arr[left] == key ? left : -1;

        int mid = (left+right)/2;

        if(arr[mid] == key)
            return mid;

        if(arr[mid] < key) {
            return search(arr, key, left, mid - 1);
        }else {
            return search(arr, key, mid + 1, right);
        }
    }
}
