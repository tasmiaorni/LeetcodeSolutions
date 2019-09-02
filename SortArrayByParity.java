
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int []res=new int [A.length];
        int t=0;
        for (int i=0;i<A.length;i++){
            if(A[i]%2==0)  res[t++]=A[i];
        }
        for (int i=0;i<A.length;i++){
            if(A[i]%2!=0)  res[t++]=A[i];             
        }
        return res;       
    }

	public static void main(String[] args) {
		int input[]=new int[] {3,1,2,4};
		SortArrayByParity sin =new SortArrayByParity();
		int res[]=sin.sortArrayByParity(input);
		for (int i:res) {
			System.out.print(i);
		}
		
	}

}
