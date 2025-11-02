class Arr16alternateposnegeff {
    static void rearrange(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posCount = 0, negCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[posCount++] = arr[i];
            } else {
                neg[negCount++] = arr[i];
            }
        }
        int i = 0, j = 0, k = 0;
        while (i < posCount && j < negCount) {
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }
        while (i < posCount) {
            arr[k++] = pos[i++];
        }
        while (j < negCount) {
            arr[k++] = neg[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

