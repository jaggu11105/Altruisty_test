package Altruisty_test;
import java.util.Scanner;
public class Treasure_sum {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the string : ");
	        String str = s.nextLine();
	        int[] arr = new int[str.length() + 1];
	        for (int i = 1; i <= str.length(); i++) {
	            arr[i] = arr[i - 1] + (str.charAt(i - 1) == 'T' ? 1 : 0);
	        }
	        System.out.println("Enter the number of queries : ");
	        int n = s.nextInt();
	        for (int i = 0; i < n; i++) {
	            int start = s.nextInt();
	            int end = s.nextInt();
	            int treasures = arr[end] - arr[start - 1];
	            System.out.println("Contains "+treasures+" treasure.");
	        }
	        s.close();
	    }
	}

