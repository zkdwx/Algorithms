/**
 * @time 2019-2-20-17:36
 * @author wx
 *《算法导论第三版》
 *第八章：计数排序
 */
public class Counting_sort {
	public static void counting_sort(int[] A,int[] B,int k) {
		int[] C=new int[k];                         
		for (int i = 0; i < k; i++) {
			C[i]=0;
		}
		for (int j = 1; j < A.length; ) {
			
			C[A[j]]=C[A[j]]+1;
			j++;
		}
		for (int i = 1; i < k; i++) {
			C[i]=C[i]+C[i-1];
		}
		for (int j = A.length-1; j >0;) {
			B[C[A[j]]]=A[j];
			C[A[j]]=C[A[j]]-1;
			 j--;
		}
	}
	
	public static void main(String[] args) {
		int[] A= {4,2,5,3,0,2,3,0,3};
		int[] B=new int[9];
		counting_sort(A, B,6);
		for (int i = 1; i < B.length; i++) {
			System.out.print(B[i]);
		}
	}

}
