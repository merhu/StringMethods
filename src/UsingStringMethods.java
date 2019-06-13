import java.util.Scanner;
public class UsingStringMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String text = "";
        int length, index;
        System.out.println("Please enter a word: ");

        text = sc.nextLine();
        length = text.length();
        System.out.println("Enter a number as an index:");
        index = sc.nextInt();
        if (index >= length) {
            System.out.println("Index is larger than length!");
        } else if (index >= 0 && index < length) {
            System.out.println("The length of " + text + " is: " + text.length());
            System.out.println("The substring from 0-" + index + " is " + text.substring(0, index));
        }
    }
}


            /*Create a program that will allow users to enter a word, and a character number index.
            Your program will print out the size of the word, as well as the substring (starting from 0)
            to the index the user specified. If the user entered index is larger than the size of the word,
            the program will print "Index is larger than length".
             */

