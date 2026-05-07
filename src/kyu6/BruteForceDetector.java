package kyu6;

import java.util.*;

// Kata: Brute Force Detector
// https://www.codewars.com/kata/695688e9858d531c29a9d748/java

public class BruteForceDetector {
    public static List<String> detectBruteForce(String[] logs) {
        Map<String, Integer> failCount = new HashMap<>();
        Set<String> suspicious = new HashSet<>();

        for (String log : logs) {
            String[] parts = log.split(" ");
            String ip = parts[0];
            String login = parts[1];

            if (login.equals("LOGIN_FAIL")) {
                int count =  failCount.getOrDefault(ip, 0) + 1;
                failCount.put(ip, count);

                if (count >= 3){
                    suspicious.add(ip);
                }
            }

            else if (login.equals("LOGIN_SUCCESS")) {
                failCount.put(ip, 0);
            }
        }

        List<String> result = new ArrayList<>(suspicious);
        Collections.sort(result);

        return result;
    }
}
