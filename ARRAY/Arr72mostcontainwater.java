import java.util.Scanner;
public class Arr72mostcontainwater {
        public static int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int maxArea = 0;
    
            while (left < right) {
                int area = Math.min(height[left], height[right]) * (right - left);
                maxArea = Math.max(maxArea, area);
    
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return maxArea;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] height = new int[n];
            System.out.println("Enter the heights:");
            for (int i = 0; i < n; i++) {
                height[i] = scanner.nextInt();
            }
            int result = maxArea(height);
            System.out.println("Maximum area: " + result);
            scanner.close();
        }
    }
      

