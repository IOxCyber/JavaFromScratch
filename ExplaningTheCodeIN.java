// The Java Scanner class is from java.util package. It is easy to use, but it must be imported for the class to work. 
import java.util.Scanner;

class take_input {
    public static void main(String[] args) {
//This expression means that we want to create a new Scanner object which will take input from the user
        Scanner scanner_one = new Scanner(System.in);

        System.out.println("Enter your name: ");
        //This indicates that the Scanner created has a method called nextLine()
        //This method takes keyboard input from the user until the user presses the Enter key
        String name = scanner_one.nextLine();
        System.out.println("Your name is: " + name);
    }
