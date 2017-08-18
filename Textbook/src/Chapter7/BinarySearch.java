package Chapter7;

/*
    This is a stub for the real thing (Chapter 18)
    Added main method
 */

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] list = {0, 1, 3, 5 };
        System.out.println( binarySearch(list, 5) );
    }

    /** Use binary search to find the key in the list */
    public static int binarySearch(int[] list, int key)
    {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
    }
}