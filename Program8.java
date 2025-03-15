import java.util.Scanner;

class StringDetails {
    static void strDetails(String a, String b) {
        if (a == null) {
            System.out.println("String is Empty");
            return;
        }

        System.out.println("The length of string is: " + a.length());
        System.out.println("The lower case String is: " + a.toLowerCase());

        if (a.equals(b)) {
            System.out.println("String values are same");
        } else {
            System.out.println("String values are different");
        }

        String output = a.replaceAll("\\s+", "");
        System.out.println("String without spaces is: " + output);
    }
}

public class Program8 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        System.out.println("Enter the string A");
        String line1 = obj1.nextLine();

        System.out.println("Enter the string B");
        String line2 = obj1.nextLine();

        StringDetails.strDetails(line1, line2);

        obj1.close(); 
    }
}
