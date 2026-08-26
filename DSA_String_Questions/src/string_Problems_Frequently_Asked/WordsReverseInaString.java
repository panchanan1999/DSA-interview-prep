package string_Problems_Frequently_Asked;

public class WordsReverseInaString {

    public static String reverseWordInString(String s) {

        String result = "";
        String[] words = s.split(" ");

        for (String word : words) {

            String reverse = "";

            for (char ch : word.toCharArray()) {
                reverse = ch + reverse;
            }

            result += reverse + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        String s = "Hello How are You ?";

        System.out.println("The reverse words : " + reverseWordInString(s));
    }
}