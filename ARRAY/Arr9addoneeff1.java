class Arr9addoneeff1 {
    static int[] addOne(int arr[]) {
        int carry = 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry > 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = carry;
            System.arraycopy(arr, 0, newArr, 1, arr.length);
            return newArr;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {9, 9, 9};
        int[] res = addOne(arr);
        for(int i : res) {
            System.out.print(i);
        }
    }
}

