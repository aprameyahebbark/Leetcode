package Medium;

public class MinimumTimetoRevertWordtoInitialState_3029 {

    static final long MOD = 1_000_000_007;
    static final long BASE = 31;
    public static int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        long[] prefix = new long[n + 1];
        long[] power = new long[n + 1];
        power[0] = 1;
        for (int i = 0; i < n; i++) {
            power[i + 1] = (power[i] * BASE) % MOD;
            prefix[i + 1] = (prefix[i] * BASE + (word.charAt(i) - 'a' + 1)) % MOD;
        }
        int time = 1;
        for (int removed = k; removed < n; removed += k) {
            int len = n - removed;
            long prefixHash = getHash(prefix, power, 0, len - 1);
            long suffixHash = getHash(prefix, power, removed, n - 1);
            if (prefixHash == suffixHash) {
                return time;
            }
            time++;
        }
        return (n + k - 1) / k;
    }
    private static long getHash(long[] prefix, long[] power, int l, int r) {
        if (l > r) {
            return 0;
        }
        long hash = (prefix[r + 1] - prefix[l] * power[r - l + 1]) % MOD;
        if (hash < 0) {
            hash += MOD;
        }
        return hash;
    }

    public static void main(String[] args) {

        String word1 = "abacaba";
        int k1 = 3;
        String word2 = "abacaba";
        int k2 = 4;
        String word3 = "abcbabcd";
        int k3 = 2;
        System.out.println("Ex1:");
        System.out.println("Word = " + word1);
        System.out.println("k = " + k1);
        System.out.println("Answer = " + minimumTimeToInitialState(word1, k1));
        System.out.println();
        System.out.println("Ex2:");
        System.out.println("Word = " + word2);
        System.out.println("k = " + k2);
        System.out.println("Answer = " + minimumTimeToInitialState(word2, k2));
        System.out.println();
        System.out.println("Ex:");
        System.out.println("Word = " + word3);
        System.out.println("k = " + k3);
        System.out.println("Answer = " + minimumTimeToInitialState(word3, k3));
    }
}