package Altruisty_test;
import java.util.Scanner;
public class min_max {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the length of the subarray:");
	        int k = s.nextInt();
	        System.out.println("Enter the length of the array:");
	        int n = s.nextInt();
	        System.out.println("Enter the array elem:");
	        int[] bright = new int[n];
	        for (int i = 0; i < n; i++) {
	            bright[i] = s.nextInt();
	        }
	        int min = Integer.MAX_VALUE;
	        for (int i = 0; i <= n - k; i++) {
	            int max = bright[i];
	            for (int j = i; j < i + k; j++) {
	                if (bright[j] > max) {
	                    max = bright[j];
	                }
	            }
	            if (max < min) {
	                min = max;
	            }
	        }
	        System.out.println("The minimum of the max is :"+min);
	        s.close();
	    }
	}

