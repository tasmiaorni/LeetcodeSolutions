
public class ReverseInteger {
	public static int reverse(int number) {
		int rev=0;
		int INT_MAX=Integer.MAX_VALUE;
		int INT_MIN=Integer.MIN_VALUE;
		while(number!=0) {
			//pop 
		   int pop=number%10;
		   number=number/10;
		   if(rev>INT_MAX/10 ||(rev==INT_MAX/10 && pop>7))return 0;
		   if(rev<INT_MIN/10 ||(rev==INT_MIN/10 && pop<-8))return 0;
			//push
		   int temp=rev*10+pop;
		   rev=temp;	
		}
		return rev;	
	}

	public static void main(String[] args) {
		int number=564;
		int res=reverse(number);
		System.out.print(res);
	}

}
