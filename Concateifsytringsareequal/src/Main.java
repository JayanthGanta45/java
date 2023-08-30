import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String concatenatedString = concatenateIfEqual(firstString, secondString);

        if (concatenatedString != null) {
            System.out.println("Concatenated string: " + concatenatedString);
        } else {
            System.out.println("The strings are not equal.");
        }

    }

    public static String concatenateIfEqual(String str1, String str2) {
        if (str1.equals(str2)) {
            StringBuffer buffer = new StringBuffer(str1);
            buffer.append(str2);
            return buffer.toString();
        }
        return null;
    }
}