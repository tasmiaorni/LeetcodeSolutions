public class RomanToInteger {

	 public static int result=0;
	public static int romantointeger(String x) {

		char[] c_arrays=x.toCharArray();
		

		for (int i=0;i<c_arrays.length;i++) {
			System.out.print(c_arrays[i]);
			System.out.print('\n');
			switch(c_arrays[i]) {
			case 'I':
				result=result+1;
			case 'V':
				result=result+5;
			case 'X':
				result=result+10;
			case 'L':
				result=result+50;
			case 'C':
				result=result+100;
			case 'D':
				result=result+500;
			case 'M':
				result=result+1000;
			default:
				result=0;				
			}
			
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.print(romantointeger("II"));

	}

}
