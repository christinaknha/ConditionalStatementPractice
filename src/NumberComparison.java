import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args){
//      Create scanner to look for user input
        Scanner scanner = new Scanner(System.in);

//      Ask user for input
        System.out.println("Enter a number: ");

//      Save user input into a variable
        int num1 = Integer.valueOf(scanner.nextLine());

//      Ask user for secondary input
        System.out.println("Enter another number: ");

//      Save user input into a variable
        int num2 = Integer.valueOf(scanner.nextLine());

        if(num1 == num2){
            System.out.println("The numbers are equal.");
        } else if (num1 > num2){
            System.out.println("The first number is larger than the second number.");
        }else{
            System.out.println("The second number is larger than the first number.");
        }

    }
}
