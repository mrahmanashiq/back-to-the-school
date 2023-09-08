import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};

        swap(arr1, 0, 1); // Pass the array and indices to swap
        System.out.println(Arrays.toString(arr1));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
