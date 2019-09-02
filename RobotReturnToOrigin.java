
public class RobotReturnToOrigin {
	 public static  boolean judgeCircle(String moves) {
	       int x=0,y=0;
	        for (char c:moves.toCharArray()){
	            if(c=='L')x--;
	            else if(c=='R')x++;
	            else if (c=='U')y++;
	            else if (c=='D')y--;
	            
	        }
	        return (x==0 && y==0);
	        
	    }
	public static void main(String[] args) {
		System.out.print(judgeCircle("LL")+"\n");
		System.out.print(judgeCircle("UD")+"\n");
		System.out.print(judgeCircle("LRUD")+"\n");

	}

}
