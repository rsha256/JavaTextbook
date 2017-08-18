import java.text.DecimalFormat;

public class Tester {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hi");
        System.out.println( myFormat(3.5555) );
    }

    public static String myFormat(double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(number).replaceAll("\\.00$", "");
    }
}
