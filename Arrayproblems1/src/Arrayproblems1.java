import java.util.Scanner;
public class Arrayproblems1 {

        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);

            System.out.println("Enter Array Length");

            int []arr=new int[scan.nextInt()];

            System.out.println("Enter "+arr.length+" elements to store in array");

            for(int i=0;i<=arr.length-1;i++)

            {

                arr[i]=scan.nextInt();

            }

            System.out.println("Array Contents Are,....");

//Treditional for loop

// for(int i=0;i<=arr.length-1;i++)

// {

// System.out.print(arr[i]+" ");

// }

            for( int x:arr)

            {

                System.out.print(x+" ");

            }

        }

    }

