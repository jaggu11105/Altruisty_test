package Altruisty_test;
import java.util.*;
public class Swap_sum {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the length of the words:");
	        int N = sc.nextInt();
	        System.out.println("Enter the strings:");
	        String A = sc.next();
	        String B = sc.next();
	        sc.close();
	        if (!change(A, B)) {
	            System.out.println(-1);
	            return;
	        }
	        System.out.println("Total number of swaps are: "+minSwaps(A.toCharArray(), B.toCharArray()));
	    }
	    private static boolean change(String A, String B) {
	        int[] freq = new int[26];
	        for (char c : A.toCharArray()) freq[c - 'a']++;
	        for (char c : B.toCharArray()) freq[c - 'a']--;
	        for (int f : freq) if (f != 0) return false;
	        return true;
	    }
	    private static int minSwaps(char[] A, char[] B) {
	        int swaps = 0;
	        int N = A.length;
	        
	        for (int i = 0; i < N; i++) {
	            if (A[i] == B[i]) continue; 
	            int j = i;
	            while (A[j] != B[i]) j++;
	            while (j > i) {
	                char temp = A[j];
	                A[j] = A[j - 1];
	                A[j - 1] = temp;
	                swaps++;
	                j--;
	            }
	        }
	        
	        return swaps;
	    }
	}


