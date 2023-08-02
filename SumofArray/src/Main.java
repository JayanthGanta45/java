import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Array Length");

        int arr[]=new int[scan.nextInt()];

        System.out.println("Enter "+arr.length+" number of elements");

        for(int i=0;i<=arr.length-1;i++)

        {

            arr[i]=scan.nextInt();

        }

        ArraySum arraysum=new ArraySum();

        int sum=arraysum.findSum(arr);

        System.out.println("Sum Of All Elements In Array Is "+sum);

    }

}
