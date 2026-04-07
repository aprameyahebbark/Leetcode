import java.util.Arrays;

public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 2;
        RemoveElement_27 obj = new  RemoveElement_27();
        int k = obj.removeElement(nums,val);
        System.out.println(" k : "+ k);
        System.out.println("Array: "+ Arrays.toString(Arrays.copyOf(nums,k)));
    }
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k ;
    }
}
