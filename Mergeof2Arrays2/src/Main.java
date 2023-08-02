import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[5];
        System.out.print("enter 1st array numbers: ");
        for (int i = 0; i <= array1.length -1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("1st array numbers are: ");
        for (int i = 0; i <= array1.length -1; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int array2[] = new int[5];
        System.out.print("enter 2nd array numbers: ");
        for (int j = 0; j <= array2.length -1; j++) {
            array2[j] = sc.nextInt();
        }
        System.out.println("2nd array numbers are: ");
        for (int j = 0; j <= array2.length -1; j++) {
            System.out.print(array2[j] + " ");
        }
        System.out.println();
        System.out.println("combined 3rd arrray: ");
        int[] combinedArray = combineArrays(array1, array2);

        // Print the combined array
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int combinedLength = length1 + length2;

        int[] combinedArray = new int[combinedLength];

        // Copy elements from array1 to combinedArray
        for (int i = 0; i < length1; i++) {
            combinedArray[i] = arr1[i];
        }

        // Copy elements from array2 to combinedArray
        for (int i = 0; i < length2; i++) {
            combinedArray[length1 + i] = arr2[i];
        }

        return combinedArray;
    }
}