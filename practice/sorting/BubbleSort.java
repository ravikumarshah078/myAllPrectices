package sorting;

public class BubbleSort {

	public static void main(String[] args) {
	
		int a[]= {12,56,3,5,-6,2,-6,4};
		int n=a.length;
	
		for(int i=0; i<n-1; i++) {
			
			for(int j=0; j<n-1; j++) {
		
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
				}
			}
		}
	
		for(int item:a) {
		
			System.out.print(item+" ,");
		}
	
	//	boolean sorted=true;
		

//		for make it not to repeat sorted element
		
//		for(int i=0; i<n-1-i; i++) {
//			
//			for(int j=0; j<n-1-i; j++) {
//		
//				if(a[j+1]<a[j]) {
//					int temp=a[j+1];
//					a[j+1]=a[j];
//					a[j]=temp;
//					
//				}
//			}
//			System.out.println();
//			if(sorted)break;
//
//	}
//
//		for(int item:a) {
//		
//			System.out.print(item+" ,");
	//	}
	}
}