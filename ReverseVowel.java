import java.util.Arrays;
import java.util.List;

public class ReverseVowel {

	public void reversevowel(String txt) {
		  char[] str=txt.toCharArray();
	        int start=0,end=str.length-1;
	        //int end=txt.length()-1;
	        List <Character> vowels=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
	        while(start<end){
	            if(!vowels.contains(str[start]) )
	            {
	                start++;
	                continue;
	            }
	            if(!vowels.contains(str[end]) )
	            {
	                end--;
	               continue;
	            }  
	            char temp=str[start];
                str[start]=str[end];
                str[end]=temp;
                start++;
                end--;
	        }
	        System.out.print(String.valueOf(str));
	               
	    }
		
	
	
	public static void main(String[] args) {
		ReverseVowel rv=new ReverseVowel();
	    rv.reversevowel("Leetcode");
		

	}

}
