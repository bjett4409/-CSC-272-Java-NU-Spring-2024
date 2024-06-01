import java.util.*;

public class SortByLength {
    public static void main(String[] args) { // List the names on the array list
        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Dick", "Harry", "Romeo", "Juliet", "William", "Sarah", "Dixon", "Robert", "Tomaz"));

        names.sort(new Comparator<String>() { // Sorting the array list using a comparator
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        for (String name : names) { // Printing the names on the list
            System.out.println(name);
        }
    }
}