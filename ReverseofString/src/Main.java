import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array: ");
        String str = sc.nextLine();
        System.out.println("before reverse: " + str);
        char [] arr1 = str.toCharArray();
        char [] arr2 = new char[arr1.length];
        int j = arr2.length-1;
        for(int i = 0; i<= arr1.length-1;i++){
            arr2[j] = arr1[i];
            j--;
        }
        str = new String(arr2);
        System.out.println("after reverse: " + str);
    }
}