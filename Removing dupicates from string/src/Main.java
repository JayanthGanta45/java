public class Main {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] encountered = new boolean[256]; // Assuming ASCII characters

        for (char c : input.toCharArray()) {
            if (!encountered[c]) {
                result.append(c);
                encountered[c] = true;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aabbcc";
        String result = removeDuplicates(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
