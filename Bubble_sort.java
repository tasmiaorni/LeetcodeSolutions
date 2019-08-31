
public class Bubble_sort {

	public void  bubblesort (int[] array) {
		boolean sorted=false;
		int temp;
	    for (int i=0;i<array.length-1;i++) {
	    	if(array[i]>array[i+1]) {
	    		temp=array[i];
	    		array[i]=array[i+1];
	    		array[i+1]=temp;    		
	    	}
	    }
		
	}

	public static void main(String[] args) {
		

	}

}
