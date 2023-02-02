package labtest1;


public class OddNumbers {
	
	public static void main(String[] args) 
	{
		//calling method
		findOdd(20);	
	}
	
	//create a method to find odd number
	public static void findOdd(int num)
	{
		int i; //declare i 
		for(i = 1; i <= num; i++) //for loop for find odd number 
		{
			if(i % 2 != 0) //those numbers module are not equal to 0 are odd numbers
			{
				System.out.println(i); //print i
			}
		}	
	}
}
