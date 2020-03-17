public class Array {
	public static void main(String args[]) {
		int a [] = {3,9,5,2};
		int fmax = 0;
		int smax = 0; 
		int maxindex = 0;
		
		
		
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] > fmax) {
				fmax = a[i];
				maxindex = i;
			}
		}
		for(int j = 0; j < a.length ; j++) {
			if(a[j] > smax && a[j] != fmax) {
				smax = a[j];
			}
		}
		
		for(int k = 0; k < a.length ; k++) {
			if(k == maxindex) {
				System.out.print(smax + " " + (fmax - smax));

			}
			else{
				
		
				System.out.print(" " + a[k] + " ");

			}
		}		
	}
}
 
