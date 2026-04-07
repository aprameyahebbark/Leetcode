import java.util.Arrays;
class TestCase_136{
    int[] num;
    TestCase_136(int[] nums){
        this.num=nums;
    }
}

public class SingleNumber_136 {
    public static void main(String[] args) {
        TestCase_136 test1 = new TestCase_136(new int[]{2,2,1});
        TestCase_136 test2 = new TestCase_136(new int[]{4,1,2,1,2});

        System.out.println("TestCase1 Solution: "+singleNumber(test1.num));
        System.out.println("TestCase1 Solution: "+singleNumber(test2.num));

    }
    static int singleNumber(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
        }
        return sum;
    }
}
