import java.util.Arrays;

public class ArrayPartitionI {
	 public static  int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int n=nums.length/2;
	        int sum=0;
	         for(int i=0;i<nums.length;i=i+2){
	             sum=sum+nums[i];
	         }
	        return sum;
	        
	    }

	public static void main(String[] args) {
		int input[]= {1,4,3,2};
		System.out.print(arrayPairSum(input));
	}

}
