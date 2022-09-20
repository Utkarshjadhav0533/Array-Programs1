import java.util.Arrays;

public class CompareTwoArray 
{
	public static void main(String[] args)
    {
 
        
        int arr1[] = { 9, 6, 3 };
        int arr2[] = { 3, 6, 9 };
       // int arr2[] = { 9, 6, 3 };
       
        if (Arrays.equals(arr1, arr2))
 
           
            System.out.println("Same");
        else
 
          
            System.out.println("Not same");
    }
}
