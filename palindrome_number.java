
public class palindrome_number {

	public static  boolean ispalindrom(int x) {
		if(x<0 ||(x%10==0 && x!=0)) {
			return false;
		}
		int reverse=0;
		while(x>reverse) {
			int last_digit=x%10;
			reverse=reverse*10+last_digit;
			x=x/10;
		}
		return (x==reverse || x== reverse/10) ;
	}
	
	public static void main(String[] args) {
		int number=1221;
		System.out.print(ispalindrom(number));

	}

}
