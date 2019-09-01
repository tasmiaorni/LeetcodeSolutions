import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
	public int uniqueMorseRepresentations(String[] words) {
        String [] morseCode=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",
        		".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
        		".--","-..-","-.--","--.."};
        Set<String> seen=new HashSet();
        for (String word:words){
            StringBuilder code=new StringBuilder();
            for (char c:word.toCharArray()){
                 code.append(morseCode[c-'a']);
            }
            seen.add(code.toString());       
        }
        return seen.size();
        
    }
	public static void main(String[] args) {
		String  words[] = {"gin", "zen", "gig", "msg"};
		UniqueMorseCode uin=new UniqueMorseCode();
		System.out.print(uin.uniqueMorseRepresentations(words));

	}

}
