public class Rotation {
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5};
		int b[] = new int [a.length];
		
		for(int i = 0; i < a.length;i++) {
			if(i+1 == a.length) {
				b[0] = a[i];
			}
			
			else {
				b[i+1] = a[i];
			}
		}
	
		for(int j = 0; j < a.length ; j++) {
			System.out.println(b[j]);
		}
		
	}
}