
public class PerfectNumber {

	 public  static boolean checkPerfectNumber(int num) {
	        int sum=0;
	        for (int i=1;i*i<=num;i++){
	            if(num%i==0){
	                sum=sum+i;
	                if(i*i!=num){
	                    sum=sum+num/i;
	                }
	                
	            }
	        }
	       return sum-num==num;
	    }
	public static void main(String[] args) {
		System.out.print(checkPerfectNumber(28)+"\n");
		System.out.print(checkPerfectNumber(65));
	}

}
