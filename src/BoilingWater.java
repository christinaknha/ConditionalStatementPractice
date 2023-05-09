import java.util.Scanner;
public class BoilingWater {
    public static void main(String[] args){
//      Create scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Provide user with prompt
        System.out.println("Enter a number greater than 212: ");

//      Save user input into a variable
        int temp = Integer.valueOf(scanner.nextLine());

//      check to see if input is greater than or equal to 212
        if (temp >= 212){
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Please enter a value greater than 212.");
        }
    }
}
