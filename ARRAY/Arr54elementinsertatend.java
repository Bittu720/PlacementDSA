public class Arr54elementinsertatend {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {10, 20, 30, 40,0};
        int element= 50;

        System.out.println("Array before insertion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        arr[n] = element;
        System.out.println("\nArray after insertion");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 