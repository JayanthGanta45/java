public class Pattern5 {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++)

            {

//no of spaces

        for (int j = 1; j <= i; j++) {

            System.out.print(" ");

        }

//no of *'s

        for (int j = 1; j <= i; j++) {

            System.out.print("*");

        }

        System.out.println();
    }
    }
}