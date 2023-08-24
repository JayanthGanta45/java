class Main{
    public static void main(String[] args) {
        for(int num = 100;num<=1000;num++){
            if(isPalindrome(num)){
                System.out.print( num + " ");
            }
        }
    }
    static boolean isPalindrome(int num){
        int original = num;
        int reserved = 0;
        while(num > 0){
            int digit = num % 10;
            reserved = reserved * 10 + digit;
            num = num / 10;
        }
        return original == reserved;
    }
}