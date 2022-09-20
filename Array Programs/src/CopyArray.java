import java.util.Scanner;
public class CopyArray  
{    
		public static void main(String[] args) 
		{ 
		int i;
        int arr1[] = new int[3];    
         
        int arr2[] = new int[3]; 
		Scanner sc= new Scanner(System.in);
		for(i=0; i<=2; i++)
		{
				System.out.print("Enter any value:");
				arr1[i]=sc.nextInt();
				
    	}
				
        System.out.println("Elements of first array: ");    
        for (i = 0; i <=2; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();
        for (i = 0; i <=2; i++) 
		{     
            arr2[i] = arr1[i];     
        }      
	    
        System.out.println("Elements of new array: ");    
        for (i = 0; i <=2; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
    }    
}