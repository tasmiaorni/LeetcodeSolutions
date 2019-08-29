import java.util.HashMap;

public class TwoSumProblem {

	public static int [] twosum(int [] array,int target) {

		HashMap<Integer,Integer>res= new HashMap<Integer ,Integer>();
		for (int i=0;i<=array.length;i++) {
			int complement=target-array[i];
			if(res.containsKey(complement)) {
				return new int[] {i,res.get(complement)};
			}
			res.put(array[i],i );
			
		}
		return null;
	}
		

	public static void main(String[] args) {
		int input[]= new int[]{1,2,3,6};
		int target=4;
		int res[]=twosum(input,target);
		for (int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}
		

	}

}
