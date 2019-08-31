import java.util.HashMap;

public class Single_Number_In_Array {

	public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> frequency=new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++){
            if(frequency.containsKey(nums[i])){
                frequency.put(nums[i],frequency.get(nums[i])+1);
            }
            else
            {
            	frequency.put(nums[i],1);
            }
        }
         for (int i:frequency.keySet()) {
        	 if (frequency.get(i)==1) {
        		 return i;
        	 }
        	 
         }
 
     return 0;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums=new int[] {4,1,2,1,2};
		Single_Number_In_Array sin=new Single_Number_In_Array();
		System.out.print(sin.singleNumber(nums));

	}

}
