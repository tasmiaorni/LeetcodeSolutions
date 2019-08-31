import java.util.*;
public class RabinKarp {

	static int   R=10;
	static int prime=101;
	// normal search algortihm
	public List naivesearch(String txt,String pat) {
		int N=txt.length();
		int M=pat.length();
        List res=new ArrayList<Integer>();
        int k=0;
		for (int i=0;i<N;i++) {
			int j;
			int flag=1;
			for (j=0;j<M;j++) {
				if (txt.charAt(i+j)!=pat.charAt(j)) {
					flag=0;
					break;
				}				
			}
			if(flag==1) {
				res.add(i);
			}
		}
		return res;
	}		
	// compute hash function
	private static   long hash(char [] str,int M ) {
		//long  h=1;
		long h=0;
		for (int k=0;k<M;k++) {
			//h=(h*R+key[k])%q;
			h=(long) (h+str[k]* Math.pow(prime, k));
			
		}
		return h;
	}
	//compute hash for rest of the input string starting from second index 
	private static  long recalculate_hash(char[] txt,long oldhash,int oldindex,int newindex,int patternlength) {
		long new_hash=oldhash-txt[oldindex];
		new_hash=new_hash/prime;
		new_hash=(long) (new_hash+txt[newindex]*Math.pow(prime, patternlength-1));
		return new_hash;
	}
	// check whether two strings are equal or not
	 private static boolean checkequal(char[] str1,int start1,int end1,char[] str2,int start2,int end2) {
		 
		 int length1=end1-start1;
		 int length2=end2-start2;
		 if(length1!=length2) return false;
		 while (start1<=end1 && start2<=end2) {
			 if ( str1[start1]!=str2[start2]) return false;
			 start1++;
			 start2++;
		 }
		 return true;
	 }
	
	public List patternsearch(char[] txt,char[] pat) {
		int M=pat.length;
		int N=txt.length;
		List res=new ArrayList<Integer>();
		long txt_hash=hash(txt,M);
		long pat_hash=hash(pat,M);
		// This loop will run for (N-M+1) times  where N-M+1= the no of possible substring with size M in our input string
		for (int i=1;i<=N-M+1;i++) {
			//if the pattern matches at the starting
			if (pat_hash==txt_hash && checkequal(txt,i-1,i+M-2,pat,0,M-1)){
			    res.add(i-1);
			}
		    //else we need to recalculate hash value 
			if(i<N-M+1) {
				txt_hash=recalculate_hash(txt,txt_hash,i-1,i+M-1,M);
			}
		}
		 return res;


	}

	public static void main(String[] args) {
		RabinKarp rks=new RabinKarp();
		System.out.print("NaiveSearch:\n");
		List index_array1=rks.naivesearch("TUSHERROYPROY","BC");
		for (int i=0;i<index_array1.size();i++) {
			System.out.print(index_array1.get(i)+"\n");
		}
		System.out.print("Rabin karp:\n");
		List index_array2=rks.patternsearch("TUSHERROYPROY".toCharArray(), "ROY".toCharArray());
		for (int i=0;i<index_array2.size();i++) {
			System.out.print(index_array2.get(i)+"\n");
		}

	}

}