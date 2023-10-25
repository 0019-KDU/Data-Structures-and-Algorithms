package Stack;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();

        //add elements to stack
        animal.push("Lion");
        animal.push("cat");
        animal.push("dog");
        animal.push("Horse");

        System.out.println("Initial Stack:" + animal);

        //// Remove element stacks
        animal.pop();

        System.out.println("New stack:" + animal);

    }
}