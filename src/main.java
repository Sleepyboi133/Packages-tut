package main; //not compleatly sure if this is needed

import utils.greet; // Import the class from the utils package
import utils.info.greetFormal; //imports class form folder

public class Main {
    public static void main(String[] args) {
        // Call
        utils.greet();  // Calls the static method
        utils.greetFormal();

        // // Create an instance of MyHelper if it has non-static methods
        // MyHelper helper = new MyHelper();
        // helper.someMethod();
    }
}

