
import java.lang.*;
//creating a child class of FoodItem which name is Pizza.
public class Pizza extends FoodItem {
    // attribute of the pizza class.
    private String size;
    // creating an empty constructor for pizza.
    public Pizza() {
        // printing the statement for the empty constructor .
        System.out.println("Empty Pizza ");
    }
    // creating a parameterized constructor would initialize data.
    public Pizza(double price, String name, String size) {
        // using super keywords to call the constructor of the parent class.
        super(price, name);
        // object of that class created.
        this.size = size;
        // printing the statement for the parameterized constructor.
        System.out.println("Valid Pizza ");
    }
    // using set method .
    public void setSize(String size) {
        this.size = size;
    }
    // using the get method .
    public String getSize() {
        return size;
    }
    // rewriting the showDetails method of parent class,
    // To Show there as more Data.
    public void showDetails() {
        System.out.println("Pizza Price : " + getPrice());
        System.out.println("Pizza Name  : " + getName());
        System.out.println("Pizza Size  : " + getSize());

    }
}


