import java.util.*;
class arrayreverse
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int n = sc.nextInt();
		if(n > 0){
			 System.out.print("Enter elements in the array: ");
			 int[] array = new int[n];
			 for(int i=0;i<array.length;i++){
			 array[i]=sc.nextInt();  
		   }
			System.out.print("Original Elements in the array : ");
			 for(int i=0;i<array.length;i++){
			 System.out.print(array[i]+" ");
		   }
     		 int[] reverse = new int[n];
		     int j = n;
             for (int i = 0; i < n; i++) {
             reverse[j - 1] = array[i];
             j = j - 1;
          }
         System.out.print("\nReversed array is : ");
         for (int k = 0; k < n; k++) {
            System.out.print(reverse[k]+" ");
		 }
		 System.out.println();
		 
		 }else{
			System.out.println("Enter valid data");
		}
	}
}
