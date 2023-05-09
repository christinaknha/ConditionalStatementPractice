import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args){
//      Create scanner that looks for user input
        Scanner scanner = new Scanner(System.in);

//      Ask user for input
        System.out.println("Enter a word: ");

//      Store user input into a variable
        String word1 = scanner.nextLine().toLowerCase();

//      Ask user for another input
        System.out.println("Enter another word: ");

//      Store user input into another variable
        String word2 = scanner.nextLine().toLowerCase();

        if (word1.equals(word2)){
            System.out.println("The strings are the same!");
        } else {
            System.out.println("The strings were different!");
        }
    }
}
