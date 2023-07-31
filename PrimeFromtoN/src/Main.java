import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Untill Where You Need Prime Numbers");
        int n = scan.nextInt();
        for(int i=3;i<=n;i++)
        {
            int res=checkPrime(i);
            if(res!=0)
            {
                System.out.println(res);
            }
        }

    }
    public static int checkPrime(int n)
    {

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return n;
    }
}

