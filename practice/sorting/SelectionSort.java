package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {3,1,-2,7,4,0};
		int n=a.length;
		
		for(int i=0; i<n-1; i++) {
			int mid=i;
			for(int j=i; j<n; j++) {
				if(a[j]<a[mid]){
					mid=j;
				}
				int temp=a[i];
				a[i]=a[mid];
			}
		
			
		} 
	
	for(int e:a) {
		System.out.print(e+" ,");
	}

}
}