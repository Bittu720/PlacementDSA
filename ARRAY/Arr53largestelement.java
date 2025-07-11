public class Arr53largestelement {
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return -1;
        }
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 8, 7, 56, 90};
        System.out.println("Largest element: " + findLargest(arr1));
        int[] arr2 = {};
        System.out.println("Largest element: " + findLargest(arr2));
    }
}
