import java.util.*;
class arraydemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	  System.out.print("Enter size of the array: ");
	  int n = sc.nextInt();
	  if(n > 0){
		System.out.println("Enter arraay values : ");

		int[] array = new int[n];
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();  
		}
		System.out.println("Array elements are: ");  
		for (int i=0; i<array.length; i++)   
		{  
		System.out.println(array[i]);  
		}  
	 }
	 else{
		System.out.println("Enter valid data ");
	 } 
	}
}
