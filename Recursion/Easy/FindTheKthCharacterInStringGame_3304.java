package Easy;

public class FindTheKthCharacterInStringGame_3304 {
    public static char kthCharacter(int k) {

        String word = "a";
        while (word.length() < k) {

            StringBuilder next = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'z') {
                    next.append('a');
                } else {
                    next.append((char) (ch + 1));
                }
            }
            word = word + next;
        }

        return word.charAt(k - 1);
    }

    public static void main(String[] args) {

        int k = 10;
        char answer = kthCharacter(k);
        System.out.println(answer);
    }
}