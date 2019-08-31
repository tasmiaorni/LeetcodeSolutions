import java.util.HashSet;
import java.util.Set;

public class Single_Number_In_Array {

	public int singleNumber(int[] nums) {
		Set<Integer> uniqueList=new HashSet<Integer>();
		for (int i=0;i<nums.length;i++) {
			if(uniqueList.contains(nums[i])) {
				uniqueList.remove(nums[i]);
			}
			else {
				uniqueList.add(nums[i]);
			}
		}
		return uniqueList.iterator().next();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums=new int[] {4,1,2,1,2};
		Single_Number_In_Array sin=new Single_Number_In_Array();
		System.out.print(sin.singleNumber(nums));

	}

}
