package org.example.optional;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionMainTest {
    private static Map<Integer, String> userEmails = new HashMap<>();

    public static Optional<String> findEmailById(int userId) {
        return Optional.ofNullable(userEmails.get(userId));
    }

    public static void main(String[] args) {
        userEmails.put(1, "alice@example.com");

        // Test 1: Get domain with orElseThrow
        try {
            String domain1 = findEmailById(1)
                    .map(email -> email.substring(email.indexOf("@") + 1))
                    .orElseThrow(() -> new IllegalStateException("Domain not found for user ID 1"));
            System.out.println("Domain for user 1: " + domain1); // Prints: Domain for user 1: example.com
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2: Get domain for missing email
        try {
            String domain2 = findEmailById(2)
                    .map(email -> email.substring(email.indexOf("@") + 1))
                    .orElseThrow(() -> new IllegalStateException("Domain not found for user ID 2"));
            System.out.println("Domain for user 2: " + domain2);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage()); // Prints: Error: Domain not found for user ID 2
        }
    }
}
