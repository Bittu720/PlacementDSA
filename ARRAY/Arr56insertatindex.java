public class Arr56insertatindex {
        public static void main(String[] args) {
            int sizeOfArray = 6;
            int[] arr = new int[sizeOfArray];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;
            arr[4] = 5;
            int index = 2;
            int element = 90;
            for (int i = sizeOfArray - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
            for (int i = 0; i < sizeOfArray; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
