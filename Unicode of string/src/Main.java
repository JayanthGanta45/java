import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");

        String str=scan.nextLine();

        UnicodeConverter theCharacters=new UnicodeConverter();

        theCharacters.printUnicode(str);

    }

}