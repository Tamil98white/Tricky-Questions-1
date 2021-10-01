import java.util.*;
class ArraySearch 
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
		 System.out.println("Enter the element to search : ");
		 int toFind = sc.nextInt();
		 boolean found = false;

		 for (int check : array) {
		 if (check == toFind) {
         found = true;
         break;
       }
     }
    
      if(found)
       System.out.println(toFind + " is found.");
      else
       System.out.println(toFind + " is not found.");
	}else{
		System.out.println("Enter valid data ");
	}
	}
}
