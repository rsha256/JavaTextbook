package Chapter4;

import java.util.Scanner;

public class OrderTwoWords
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two words
        System.out.print("Enter the first word: ");
        String word1 = input.nextLine();
        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();

        if (word1.compareTo(word2) < 0)
            System.out.println("The words in alphabetical order are " +
                    word1 + " " + word2);
        else
            System.out.println("The words in alphabetical order are " +
                    word2 + " " + word1);
    }
}