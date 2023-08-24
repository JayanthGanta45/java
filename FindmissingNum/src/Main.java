public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7};
        int res = FindNum(arr);
        System.out.println("the missing num is : " + res);
    }
     static int FindNum(int [] arr){
        int n = arr.length;
        int totalsum = (n +1)*(n + 2)/2;
        int actualnum = 0;
        for(int num : arr){
            actualnum += num;
        }
        return totalsum - actualnum;
    }
}
