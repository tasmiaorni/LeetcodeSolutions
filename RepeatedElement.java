import java.util.HashSet;
import java.util.Set;

public class RepeatedElement {

	 public static  int repeatedNTimes(int[] A) {
	        Set <Integer> s=new HashSet<Integer>();
	        for (int i=0;i<A.length;i++){
	            if(!s.contains(A[i])){
	                s.add(A[i]);
	            }
	            else {
	                return A[i];
	            }
	        }
	       
	        return 0;
	        
	    }
	public static void main(String[] args) {
		int [] input= {5,1,5,2,5,3,5,4};
		System.out.print(repeatedNTimes(input));
	}

}
