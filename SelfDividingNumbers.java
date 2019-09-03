import java.util.LinkedList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result=new LinkedList<Integer>();
       
        for (int i=left;i<=right;i++){
            if(isSelfDividing(i))result.add(i);
            
        }
        return result;
        
    }
    public boolean isSelfDividing(int number){
            int x=number;
            while(x>0){
            int digit=x%10;
            x=x/10;
            if(digit==0 || (number%digit)>0) return false;
            }
        return true;         
    }
	public static void main(String[] args) {
		SelfDividingNumbers sin=new SelfDividingNumbers();
		List<Integer> output=sin.selfDividingNumbers(1,22);
		for (int i: output) {
			System.out.print(i+" ");
		}

	}

}
