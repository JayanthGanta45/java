import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Array Length");

        int arr[]=new int[scan.nextInt()];

        System.out.println("Enter "+arr.length+" Elements ");

        for(int i=0;i<=arr.length-1;i++)

        {

            arr[i]=scan.nextInt();

        }

        System.out.println("Array Elements Before Sorting...");

        for (int x : arr) {

            System.out.print(x+" ");

        }

        System.out.println();

//SELECTION SORT LOGIC

        int min;

        int pos;

        int help;

        for(int i=0;i<=arr.length-2;i++)

        {

            min=arr[i];

            pos=i;

            for(int j=i+1;j<=arr.length-1;j++)

            {

                if(arr[j]<min)

                {

                    min=arr[j];

                    pos=j;

                }

            }

//swap arr[i] and arr[pos]

            help=arr[i];

            arr[i]=arr[pos];

            arr[pos]=help;

        }

        System.out.println("Array Elements After Sorting...");

        for (int x : arr) {

            System.out.print(x+" ");

        }

    }

}