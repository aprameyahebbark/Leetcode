package Easy;

import java.util.HashMap;
public class WordPattern_290 {
    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(word)) {
                    return false;
                }
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog bat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}