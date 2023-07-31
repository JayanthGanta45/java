import java.util.Scanner;

public class Main {
    public static int n1 = 0,n2 =1,n3 = 0;
    static void Fibonacci(int num){
        if(num > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            Fibonacci(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numebr: ");
        int a = sc.nextInt();
        System.out.print(n1 + " " + n2);
        Fibonacci(a - 2);
    }
}
