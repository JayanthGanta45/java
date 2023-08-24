public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,5,6,8,9,10};
        MissingNumbers(arr);
    }
    static void MissingNumbers(int [] arr){
        int n = arr.length + 1;
        boolean [] found = new boolean[n];
        for(int num : arr) {
            if (num >= 1 && num <= arr.length) {
                found[num] = true;
            }
        }
        System.out.println("Missing numbers are: ");
        for(int i = 1; i <= arr.length;i++){
            if(!found[i]){
                System.out.print(" " + i );
            }
        }
    }
}
