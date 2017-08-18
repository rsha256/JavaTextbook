package Chapter3;

import java.util.Scanner;

public class AdditionQuiz
{
    public static void main(String[] args)
    {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int number = input.nextInt();

        int answer = number1 + number2;

        if(number == (number1 + number2))
        {
            System.out.println(
                    number1 + " + " + number2 + " = " + number + " is " +
                            (number1 + number2 == number));
            System.out.println("Your Final Score is: 100%");
        }
        else
        {
            System.out.println("You are bad. The correct answer is: " + answer);
            System.out.println("Your Final Score is: 0%");
        }
    }
}