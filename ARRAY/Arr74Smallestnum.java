public class Arr74Smallestnum {
    public static int findsmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return -1;
        }
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 7, 56, 90};
        System.out.println("Smallest element: " + findsmallest(arr));
    }
}
