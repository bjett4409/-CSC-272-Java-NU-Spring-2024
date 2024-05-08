import java.util.Scanner; // Imported a scanner to utilize for this project.

// ColorDemo.java
public class ColorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Input Scanner for input.
        
        // Prompt the user for RGB values
        System.out.println("Enter the Red value (0-255):"); // First user input to determine color value 0-255.
        int red = scanner.nextInt(); // Read user input for red value.
        
        System.out.println("Enter the Green value (0-255):"); // Second user input to determine color value 0-255.
        int green = scanner.nextInt(); // Read user input for green value.
        
        System.out.println("Enter the Blue value (0-255):"); // Third user input to determine color value 0-255.
        int blue = scanner.nextInt(); // Read user input for blue value.
        
        Color userColor = new Color(red, green, blue); // Color code format will be RGB (Red, Green, Blue).

        System.out.println("The hexadecimal color code is: " + userColor.displayColor()); // Display the color code derived from the user.
        
        scanner.close(); // Scanner closed
    }
}

class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) { // This is used to format the color code from RGB format.
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String displayColor() { // Color code is displayed in hexadecimal.
        return String.format("#%02X%02X%02X", red, green, blue);
    }
}