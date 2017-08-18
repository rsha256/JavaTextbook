package Chapter18;

/*
    I implemented user input
    along with a message that tells you where something that's not in the list would be.
    changed the list data type from int to double
    made the list pre-sorted
 */

import java.util.Scanner;

public class RecursiveBinarySearch
{
    private static boolean error = false;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number you are searching for: ");
        int key = input.nextInt();

        int[] list = { 0, 1, 3, 7, 5 };


        // below i call on a method which in turn does the search
        System.out.print( recursiveBinarySearch(list, key) );

        // if error happens
        if (error)
        {
            System.out.println(" in the array!");
        }
    }

    private static int recursiveBinarySearch(int[] list, int key)
    {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    private static int recursiveBinarySearch(int[] list, int key, int low, int high)
    {
        if (low > high)  // The list has been exhausted without a match
        {
            System.out.print("I'm sorry but the number you entered is not in the list if it was it'd be at position #");
            error = true;
            return -((-low - 1) + 1);
        }

        int mid = (low + high) / 2;
        if (key < list[mid])
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return recursiveBinarySearch(list, key, mid + 1, high);
    }
}