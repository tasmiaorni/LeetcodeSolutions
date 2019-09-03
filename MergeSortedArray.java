import java.util.Arrays;

public class MergeSortedArray {
	public static  void merge(int[] nums1, int m, int[] nums2, int n) {
		int j=0;
		int totalLength=m+n;
		for (int k=totalLength-1;k>totalLength-1-n;k--) {
			if(nums1[k]==0) {
				nums1[k]=nums2[j];
				j++;			
			}		
		}
		Arrays.sort(nums1);
		for (int item:nums1) {
			System.out.print(item+" ");
		}
	}

	public static void main(String[] args) {
		int []nums1 = {1,2,3,0,0,0};
		int m = 3;
		int []nums2 = {2,5,6};       
		int n = 3;
		merge(nums1,m,nums2,n);

	}

}
