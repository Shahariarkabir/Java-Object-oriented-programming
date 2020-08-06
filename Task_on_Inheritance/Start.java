
import java.lang.*;

// Create a class for creating  object
public class Start {
    public static void main(String[] args) {
        // creating objects for Pizza class.
        Pizza s1 = new Pizza();
        Pizza s2 = new Pizza(350.50, "Spice Pizza", "Medium");
        s2.showDetails();
        System.out.println("\n==============================\n");

        // creating objects for Burger class.
        Burger r1 = new Burger();
        Burger r2 = new Burger(450.50, "Pure Naga Cheese Burger", 4);
        r2.showDetails();
        System.out.println("\n==============================\n");

    }
}
