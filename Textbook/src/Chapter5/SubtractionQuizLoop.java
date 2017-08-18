package Chapter5;

/*
    I added some improvements with how the results are displayed
 */

import java.util.Scanner;

public class SubtractionQuizLoop
{
    public static void main(String[] args)
    {
        final double NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Counts the number of questions
        long startTime = System.currentTimeMillis();
        StringBuilder output = new StringBuilder(" "); // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS)
        {
            // 1. Generate two random single-digit integers
            int number1 = (int)(Math.random() * 100);
            int number2 = (int)(Math.random() * 100);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2)
            {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Prompt the student to answer "What is number1 – number2?"
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 - number2 == answer)
            {
                System.out.println("You are correct!");
                correctCount++; // Increase the correct answer count
            }
            else
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));

            // Increase the question count
            count++;

            output.append("\n").append(number1).append("-").append(number2).append("=").append(answer).append((number1 - number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("\n");
        System.out.println("Correct count is " + correctCount + "\nPercentage is "+ ( (correctCount/NUMBER_OF_QUESTIONS)*100 ) + "%\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}