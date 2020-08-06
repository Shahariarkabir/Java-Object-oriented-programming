
import java.lang.*;
//creating a class named FoodItem .
//which is the parent class of Burger & Pizza.
public class FoodItem {
    // Attribute of the class FoodItem.
    protected double price;
    // This is a parent class that we are using Protected modifier.
    protected String name;
    // Creating empty constructor for the class
    public FoodItem() {
        // Print the statement for the empty constructor.
        System.out.println("Empty FoodItem");
    }
    // creating a parameterized constructor.
    public FoodItem(double price, String name) {
        // showing the statement for the parameterized constructor.
        System.out.println("Valid FoodItems ");
        // "this" keyword is used for declaring variables.
        this.price = price;
        this.name = name;
    }
    // set the method for price.
    public void setPrice(double price) {
        this.price = price;
    }
    // get a method for price.
    public double getPrice() {
        return price;
    }
    // set method for name.
    public void setName(String name) {
        this.name = name;
    }
    // get a method for the name.
    public String getName() {
        return name;
    }
    // showing the details of FoodItem using ShowDetails method.
    public void showDetails() {
        System.out.println("The food item Price is : " + getPrice());
        System.out.println("The item Name is  : " + getName());

    }
}
