//Given an input string s, reverse the order of the words.

public class Main {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int start = s.length() - 1;
        int end = s.length();
        while (start >= 0) {
            while (start >= 0 && s.charAt(start) == ' ') {
                start--;
            }
            end = start + 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            result.append(s, start + 1, end).append(' ');
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
    }
}