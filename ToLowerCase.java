
public class ToLowerCase {
	public static String toLowerCase(String str) {
        char [] strArray=str.toCharArray();
        for (int i=0;i<strArray.length;i++){
            if((strArray[i]>='a' && strArray[i]<='z')||(strArray[i]>='A' && strArray[i]<='Z')){
                if(!Character.isLowerCase(strArray[i])){
                int value=(int)strArray[i]+32;
                strArray[i]=(char) value;
            }
            
            }
            
        }
        return String.valueOf(strArray);
        
    }

	public static void main(String[] args) {
		System.out.print(toLowerCase("AlPhab56&"));
	}

}
