package Altruisty_test;
import java.util.Scanner;
public class Profitofstock {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the number of days :");
	        int n = s.nextInt();
	        int[] prices = new int[n];
	        System.out.println("Enter the price of the stocks:");
	        for (int i = 0; i < n; i++) {
	            prices[i] = s.nextInt();
	        }
	        int maxProfit = maxProfit(prices);
	        System.out.println("The maximum profit that can be made is :"+maxProfit);
	        s.close();
	    }

	    public static int maxProfit(int[] prices) {
	        int minPrice = Integer.MAX_VALUE;
	        int maxProfit = 0;

	        for (int i = 0; i < prices.length; i++) {
	            if (prices[i] < minPrice) {
	                minPrice = prices[i]; 
	            }

	            int profit = prices[i] - minPrice; 
	            if (profit > maxProfit) {
	                maxProfit = profit; 
	            }
	        }
	        return maxProfit;
	    }
	}
