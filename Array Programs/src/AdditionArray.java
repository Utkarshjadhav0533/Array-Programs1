public class AdditionArray 
{

	public static void main(String[] args) 
	{

		int [] a= {10,20,30,40,50,};
		int [] b= {50,20,30,40,10,};
		int [] c= new int[a.length];
		int i;

		for(i=0;i<a.length;i++)
		{
			System.out.println("Addition of two Array " + (c[i] = a[i] + b[i]));
		}
	}
}