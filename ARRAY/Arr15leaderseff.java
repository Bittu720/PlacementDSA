public class Arr15leaderseff {
    static void leaders(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n]; 
        int index = 0;
        int maxRight = arr[n - 1];
        temp[index++] = maxRight;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                temp[index++] = maxRight;
            }
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        leaders(arr);
    }
}
