import java.util.HashMap;

public class Single_Number_II {

	 public int singleNumber(int[] nums) {
	        HashMap<Integer,Integer> frequencyList=new HashMap<Integer,Integer>();
	        for (int i=0;i<nums.length;i++){
	        	frequencyList.put(nums[i],frequencyList.getOrDefault(nums[i], 0)+1);
	        }
	        for(int key:frequencyList.keySet()){
	            if (frequencyList.get(key)==1)
	            {
	                return key;
	            }            
	        }
	        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums=new int[] {4,1,2,1,2};
		Single_Number_II sin=new Single_Number_II();
		System.out.print(sin.singleNumber(nums));

	}

}
