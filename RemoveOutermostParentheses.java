
public class RemoveOutermostParentheses {
	  public static  String removeOuterParentheses(String S) {
	        StringBuilder sb=new StringBuilder();
	        int count=0;
	        for (char c:S.toCharArray()){
	            if(c=='(' && (count=count+1) >1){
	                sb.append(c);
	            }
	            if(c==')' && (count=count-1) >=1){
	                sb.append(c);
	            }
	        }
	        return sb.toString();
	        
	    }

	public static void main(String[] args) {
		System.out.print(removeOuterParentheses("(()())(())(()(()))"));

	}

}
