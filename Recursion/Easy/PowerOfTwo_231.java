package Easy;

public class PowerOfTwo_231 {
    public static void main (String[] agrs) {
        int n = 60;
        if(isPowerOfTwo(n)){
            System.out.println(n+ " The number is power of 2");
        }else{
            System.out.println(n + " The number is not a power of 2");
        }

    }
        public static boolean isPowerOfTwo(int n) {
            return n>0 && ( n &(n-1))==0;
        }
    }
