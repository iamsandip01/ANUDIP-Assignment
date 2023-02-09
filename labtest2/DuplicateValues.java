package labtest2;
import java.util.Scanner;//import Scanner
public class DuplicateValues {
	public static void main(String[] args) 
    {  
		
        String[] arr = new String[5];//declare 10 storage of an array

        System.out.println("Please enter 5 Strings");              
        Scanner s = new Scanner(System.in);
        for (int i = 0;i<arr.length;i++){ //'for loop' for getting input from user side

            arr[i] = s.nextLine(); //store input an array


        }
        for (int i = 0; i <arr.length-1; i++) //'for loop' for compare 1st string
        {
            for (int j = i+1; j <arr.length; j++)//select next string for compare
            {
                if((arr[i]).equals(arr[j]) && i != j )//using '.equale' for comparing two strings
                    System.out.println("Duplicate Element is : "+arr[j]); //if duplicate then print that string
            }
                
         }
    }
}    
