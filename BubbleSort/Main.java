public class Main {
    public static void main(String[] args) {
        int arr[] = {100,50,150,25,75,125,175};
        System.out.println("before bubble sorting: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Bubblesort(arr);
    }
    static void Bubblesort(int arr[]){
        int n = arr.length;
        int help = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                if(arr[j-1] > arr[j]){
                    help = arr[j-1];
                    arr[j - 1] = arr[j];
                    arr[j] = help;
                }
            }
        }
        System.out.println("After bubble sorting: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}