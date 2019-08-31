
public class ReverseWordsInString {
	  public String reverseWords(String s) {
	        String [] words=s.split(" ");
	        StringBuilder result=new StringBuilder();
	        for (String i:words){
	             StringBuilder sb=new StringBuilder(i);
	             result.append(sb.reverse()).append(" ");
	        }
	       return result.toString().trim();
	    }
	public static void main(String[] args) {
		ReverseWordsInString sin=new ReverseWordsInString();
		System.out.print(sin.reverseWords("Let's take LeetCode contest"));

	}

}
