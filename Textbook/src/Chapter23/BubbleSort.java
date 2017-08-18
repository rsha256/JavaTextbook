package Chapter23;

import java.util.Scanner;

public class BubbleSort
{
    /** Bubble sort method
     *  I improved this so the user can input the list, i also implemented a foreach loop!
     *  Here is a sample user input: {2, 3, 2, 5, 6, 1, -2, 3, 14, 12}
     *  */
    private static void bubbleSort(int[] list)
    {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++)
        {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++)
            {
                if (list[i] > list[i + 1])
                {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

    /** A test method */
    public static void main( String [] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 10 numbers (separate numbers with spaces)");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();
        int num8 = input.nextInt();
        int num9 = input.nextInt();
        int num10 = input.nextInt();

        int[] list = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        bubbleSort(list);
        for (int aList : list)
            System.out.print(aList + " ");
    }
}