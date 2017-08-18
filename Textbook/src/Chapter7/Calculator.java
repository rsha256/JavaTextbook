package Chapter7;

/*
    Note: for this program to work, you need to compile and run this program in command prompt or powershell or terminal.
    If you don't know how to do that I wrote some instructions below:
    1. use the cd command to change the file directory to where your program's stored
    2. type "javac Calculator.java" (without quotes) then press enter (you don't have to do this step if you already have a class file from compiling in an IDE)
    3. type "java Calculator operand1 + operand2" (without quotes) then press enter (replace operand1 and operand 2 for integers)
 */

public class Calculator
{
    /** Main method */
    public static void main(String[] args)
    {
        // Check number of strings passed
        if (args.length != 3)
        {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operation
        int result = 0;

        // Determine the operator
        switch (args[1].charAt(0))
        {
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}