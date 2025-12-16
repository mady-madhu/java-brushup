package org.example.collection;

import java.util.HashMap;
import java.util.Map;
public class MapTest {
        public static void main(String[] args) {
            // Create a HashMap
            Map<String, Integer> scores = new HashMap<>();

            // Add entries
            scores.put(null, 90);
            scores.put("Alice", 90);
            scores.put(null, 80);
            scores.put("Bob", 85);
            scores.put("Charlie", 95);
            scores.put("Alice", 92); // Overwrites previous value for "Alice"

            // Print map
            System.out.println("Scores: " + scores); // Output: {Alice=92, Bob=85, Charlie=95}

            // Access value
            System.out.println("Bob's score: " + scores.get("Bob")); // Output: 85

            // Check if key exists
            System.out.println("Contains Alice? " + scores.containsKey("Alice")); // Output: true

            // Remove entry
            scores.remove("Charlie");
            System.out.println("After removing Charlie: " + scores); // Output: {Alice=92, Bob=85}

            // Iterate over entries
            System.out.println("Iterating entries:");
            for (Map.Entry<String, Integer> entry : scores.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Iterate using forEach (Java 8+)
            scores.forEach((key, value) -> System.out.println(key + " -> " + value));
        }

}
