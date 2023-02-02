package labtest1;

public class Alternate {

	public static void main(String[] args) {
		// initialize array
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		int arr1[]=new int[arr.length];
		int n=arr.length;
		int sum=0; // initialize sum
		
		//alternate array using for loop
		for(int i=0;i<n;i+=2) {
			arr1[i]=arr[i]; //store alternate element in second array
		}
		 
		
		//all elements add them to sum
		for(int i=0;i<arr1.length;i++) {
				sum+=arr1[i];
		}
		System.out.println(sum); //printing the value of sum
	}
 
	

}