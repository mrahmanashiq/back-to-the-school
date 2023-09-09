public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, -3};
        int max = Integer.MIN_VALUE;
        int result = maxValue(arr, max);
        System.out.println(result);
    }

    private static int maxValue(int[] arr, int max) {
        for (int i=0; i<arr.length; i++) {
            /*if (arr[i] > max) {
                max = arr[i];
            }*/
            max = Math.max(arr[i], max);

        }
        return max;
    }
}
