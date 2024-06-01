import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        String input = "rum"; // Inputting the string rum
        List<String> substrings = generateAllSubstrings(input);
        System.out.println(substrings);
    }

    public static List<String> generateAllSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        findSubstrings("", str, substrings);
        substrings.add(""); // Including the empty string as part of the substrings
        return substrings;
    }

    private static void findSubstrings(String current, String remainder, List<String> substrings) {
        if (remainder.length() == 0) {
            if (!current.isEmpty()) {
                substrings.add(current);
            }
            return;
        }

        findSubstrings(current + remainder.charAt(0), remainder.substring(1), substrings);  // Include the first character
        findSubstrings(current, remainder.substring(1), substrings); // Exclude the first character
    }
}