
class Arr9addoneeff2 {
    static int[] addOne(int[] arr) {
        int index = arr.length - 1;
        while (index >= 0 && arr[index] == 9)
            arr[index--] = 0;
        if (index < 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = 1;
            System.arraycopy(arr, 0, newArr, 1, arr.length);
            return newArr;
        }
        else
            arr[index]++;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] res = addOne(arr);
        for (int i : res) {
            System.out.print(i);
        }
    }
}

