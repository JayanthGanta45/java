import  java.util.Scanner;

public class GCDApp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to find GCD");
        int m = scan.nextInt();
        int n = scan.nextInt();

        GCD gcd = new GCD();
        int res = gcd.findGCD(m, n);
        System.out.println("GCD OF " + m + " AND " + n + " IS " + res);

    }
}
