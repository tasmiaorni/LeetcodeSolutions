
public class StoneJewel {
	
	 public int numJewelsInStones(String J, String S) {
	        char [] stone=S.toCharArray();
	        int count =0;
	        for (int i=0;i<stone.length;i++){       
	            if (J.indexOf(stone[i])>=0){
	                count++;
	            }
	        }
	        return count;
	    }
	public static void main(String[] args) {
		StoneJewel sj=new StoneJewel();
		System.out.print(sj.numJewelsInStones("aB", "aAAbBBJ"));
	}

}
