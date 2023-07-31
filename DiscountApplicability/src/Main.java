public class Main {
    public static void checkDiscount(double purchaseAmount) {
        if (purchaseAmount > 100) {
            System.out.println("Discount Applicable");
        } else{
            System.out.println("Discount not Applicable");
        }
    }
    public static void main(String[] args) {
        checkDiscount(150.0);
    }
}