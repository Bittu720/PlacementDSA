public class Arr58meanofarray {
        public static void main(String[] args) {
            int[] arr = {1, 3, 4, 2, 6, 5, 8, 7};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
    
            int mean = sum / arr.length; 
            System.out.println("Mean: " + mean);
        }
    }
     