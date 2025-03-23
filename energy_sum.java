package Altruisty_test;
import java.util.*;
public class energy_sum {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int sensors = 5, times = 4;
	        int[][] readings = new int[times][sensors];
	        int[] avgPower = new int[sensors];
	        for (int i = 0; i < times; i++) {
	            for (int j = 0; j < sensors; j++) {
	                readings[i][j] = sc.nextInt();
	                if (readings[i][j] < 10 || readings[i][j] > 200) {
	                    System.out.println("INVALID INPUT");
	                    return;
	                }
	                avgPower[j] += readings[i][j];
	            }
	        }
	        sc.close();
	        for (int i = 0; i < sensors; i++) {
	            avgPower[i] = Math.round(avgPower[i] / (float) times); 
	        }
	        int maxPower = 0;
	        int sensorNumber = -1;
	        for (int i = 0; i < sensors; i++) {
	            if (avgPower[i] > maxPower) {
	                maxPower = avgPower[i];
	                sensorNumber = i + 1; 
	            }
	        }
	        if (maxPower < 50) {
	            System.out.println("Energy consumption is optimal.");
	        } else {
	            System.out.println("Sensor Number : " + sensorNumber);
	        }
	    }
	}
