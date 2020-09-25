import animals.Animal;
import stackTask.SymmetricallyArranged;

import java.util.Scanner;

public class TortTaskMain {
    public static void main(String[] args){
        // To check an animal uncomment method listenToTheAnimal() below.
        // To check if the brackets are symmetrically arranged in a string uncomment
        // method checkParentheses() below.

        // listenToTheAnimal();
        // checkParentheses();
    }

    public static void checkParentheses(){
        System.out.println("enter an expression with parentheses and click Enter");
        String line = (new Scanner(System.in)).nextLine();
        SymmetricallyArranged.isBalanced(line);
    }

    public static void listenToTheAnimal(){
        System.out.println("enter an animal you want to hear (only Cat or a Dog) end click Enter");
        String line = (new Scanner(System.in)).nextLine();
        Animal.sound(line);
    }


}
