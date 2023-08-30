public class UnicodeConverter {

    void printUnicode(String str) {

        for (int i = 0; i <= str.length() - 1; i++) {

            int unicode = (int) str.charAt(i); // convert the each character into int then the resulted number store in unicode

            System.out.print(unicode + " ");

        }
    }
}
