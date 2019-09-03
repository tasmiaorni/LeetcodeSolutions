
public class HammingDistance {

	  public static int hammingDistance(int x, int y) {
		 int result=x^y;
		 int setBits=0;
		while(result>0) {
			 result=result&(result-1);
			 setBits++;
		 }
		 return setBits;
	    }
	public static void main(String[] args) {
		System.out.print(hammingDistance(1,4));
	}

}
