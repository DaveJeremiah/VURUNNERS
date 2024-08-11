/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runners;

/**
 *
 * @author USER
 */
import java.util.HashMap;
import java.util.Map;

public class Runners {
    public static void main(String[] args) {
        // Create arrays to store names and times of runners
        
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        // A map that associates names with times
        Map<String, Integer> runnerTimes = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            runnerTimes.put(names[i], times[i]);
        }

        // Variables to keep track of the fastest and second fastest runners
        String fastestRunner = "";
        String secondFastestRunner = "";
        int fastestTime = Integer.MAX_VALUE;
        int secondFastestTime = Integer.MAX_VALUE;

        // Iterate over the map to find the fastest and second fastest
        for (Map.Entry<String, Integer> entry : runnerTimes.entrySet()) {
            int currentTime = entry.getValue();
            String currentName = entry.getKey();

            if (currentTime < fastestTime) {
                // Update second fastest runner
                secondFastestTime = fastestTime;
                secondFastestRunner = fastestRunner;

                // Update fastest
                fastestTime = currentTime;
                fastestRunner = currentName;
            } else if (currentTime < secondFastestTime && currentTime != fastestTime) {
                // Update second fastest runner
                secondFastestTime = currentTime;
                secondFastestRunner = currentName;
            }
        }

        // Print results
        System.out.println("Fastest Runner: " + fastestRunner + " with time " + fastestTime + " minutes.");
        System.out.println("Second Fastest Runner: " + secondFastestRunner + " with time " + secondFastestTime + " minutes.");
    }
}
