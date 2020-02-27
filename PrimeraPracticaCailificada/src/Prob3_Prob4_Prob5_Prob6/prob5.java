package Prob3_Prob4_Prob5_Prob6;

public class prob5 {
	public static void  main(String[] args) {
		int A[] = {1,3,6,8,10,15,19,24,74};
		int B[] = {2,3,7,20,24,54};
		int temp , m = A.length , n = B.length;
		int unionAB[];
		
		unionAB = new int [m+n];
		
		for (int i=0;i<m;i++) {
			unionAB[i]=A[i];
		}
		
		for (int j=0;j<n;j++) {
			unionAB[m+j]=B[j];	
					}
		for (int i=0;i<unionAB.length;i++) {
			for (int k=i+1;k<unionAB.length;k++) {
				if(unionAB[i]==unionAB[k]) {
					unionAB[k]= -1;						
				}
			}
			
		}
		
		for (int j=0;j<unionAB.length;j++) {
			for (int k=j+1;k<unionAB.length;k++) {
				if(unionAB[j]>unionAB[k]) {
					temp= unionAB[j];
					unionAB[j]= unionAB[k];	
					unionAB[k]=temp;
				}
			}
			
		}
		System.out.print("A U B = {");
		for(int g=0;g<unionAB.length;g++) {
			if(unionAB[g]>=0) {
				System.out.print(unionAB[g]);
					if(g== unionAB.length-1) {
						System.out.print("}");
					}
					else {
						System.out.print(", ");
					}
			}
		}
	}
}
