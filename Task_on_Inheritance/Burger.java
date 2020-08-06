
import java.lang.*;

//creating a child class of FoodItem which  name is Burger.
public class Burger extends FoodItem {

    // attribute of the burger class.
    private int numberOfPatties;

    // empty constructor for Burger class.
    public Burger() {

        // showing the statement for the empty constructor.
        System.out.println("Empty Burger ");
    }

    // creating a parameterized constructor would initialize data.
    public Burger(double price, String name, int numberOfPatties) {
        // calling the parent class constructor by using super.
        super(price, name);
        // object of that class created.
        this.numberOfPatties = numberOfPatties;
        // showing statement for parameterized constructor.
        System.out.println("Valid Burger ");
    }

    // creating a set method for the new attribute.
    public void setNumberOfPatties(int numberOfPatties) {
        this.numberOfPatties = numberOfPatties;
    }

    // get method.
    public int getNumberOfPatties() {
        return numberOfPatties;
    }

    // rewriting the showDetails method of parent class.
    public void showDetails() {
        System.out.println("Burger Price : " + getPrice());
        System.out.println("Burger Name  : " + getName());
        System.out.println("Number of Total Patties : " + getNumberOfPatties());

    }
}
