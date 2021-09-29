import java.util.*;
import java.math.BigInteger;
class stringAssignments 
{

	public static void main(String[] args) 
	{
		arrayminmax mm = new arrayminmax();
		mm.minmax();
		mm.reverse();
		mm.sorting();
		mm.occurence();
		mm.split();
		mm.duplicate();
		mm.fact();
		mm.celement();
		mm.rearrange();
		mm.sumProdduct();
	}
}

class arrayminmax
{
//Array min max value
	void minmax(){
	int[] nums={6,-1,-2,-3,0,1,2,3,4};
	Arrays.sort(nums);
	System.out.println("Minimum = " + nums[0]);
	System.out.println("Maximum = " + nums[nums.length-1]);
	}
//Array Reverse
	void reverse(){
		int a[] = {1,2,3,4,5};
		System.out.println();  
		System.out.println("Original array is : "); 
		for (int i=0; i< a.length;i++) {  
            System.out.print(a[i] + " ");  
        }  
        System.out.println("Array in reverse order: "); 
        for (int i = a.length-1; i >= 0; i--) {  
            System.out.print(a[i] + " ");  
        }
		System.out.println(); 
		System.out.println(); 
	}
//Array sorting
	void sorting(){
	int a[] = {8,7,1,3,0,9,2,4,6,5};
	System.out.println();
	System.out.println("Array Sorting");
	System.out.print("Original : ");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i] + " ");  
	  }
	Arrays.sort(a);
	System.out.println();
	System.out.print("Sorted : ");
	for (int i=0 ;i<a.length; i++) {  
		System.out.print(a[i] + " ");  
      }  
	  System.out.println(" "); 
	  System.out.println(" "); 
	}
//occurence of an integer 
	void occurence(){
	int x,i=0,count=0;
	int b[]={1,3,5,2,3,3,5,2};
	Scanner s = new Scanner(System.in);
	System.out.println();
	System.out.println("Given Array is : ");
	for(i=0;i<b.length;i++){
	System.out.print(b[i]+" ");
	}
	System.out.println();
	System.out.print("Enter the Element to find occurence : ");
        x = s.nextInt();
        for(i = 0; i <b.length ; i++)
        {
            if(b[i] == x)
            {
                count++;
            }
        }
        System.out.println("Occurrence of the Element is : "+count);
		System.out.println();
	System.out.println();

	}
	
//Split Negative && positive number 

	void split(){

		int array[]={1,5,-10,3,-6,-4};
		int t=array.length;
		int j = 0, temp;
		System.out.println("Split Negative && positive number ");
		System.out.print("Original array is : ");
		for (int i = 0; i < t; i++){
            System.out.print(array[i] + " ");
		}
		System.out.println(" "); 
		System.out.print("Splited : ");
        for (int i = 0; i < t; i++) {
            if (array[i] < 0) {
                if (i != j) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
		for (int i = 0; i < t; i++){
            System.out.print(array[i] + " ");}
			System.out.println();
        	System.out.println();
	}

//Find duplicate in an array	
	void duplicate(){

		  int a[]={1, 2, 3, 4, 2, 7, 8, 8, 3};   
         System.out.println(" "); 
		 System.out.println("Original array is : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		 }
		 System.out.println(" "); 
        System.out.println("Duplicate elements in given array: ");  
            for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                    System.out.println(a[j]);  
            }  
        }  
		System.out.println();
	    System.out.println();
	}

//Find the big integer factorial value

	 void fact()
    {	int a[]={1,5,20,10,6};
	    Arrays.sort(a);
        int n = a[a.length-1];
        BigInteger f = new BigInteger("1"); 
        for (int i = 2; i <= n; i++){
            f = f.multiply(BigInteger.valueOf(i));
 
         }
		 System.out.print("Factorial value is : ");
		System.out.print(f);
		System.out.println();
	    System.out.println();
    }
//Find common elements in three sorted array
	void celement(){
		int a1[] = {1, 5, 10, 20, 40, 80};
        int a2[] = {6, 7, 20, 80, 100};
        int a3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		System.out.println(" ");
	   System.out.print("Common elements are : ");
		 
		  int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length && k < a3.length)
        {
             if (a1[i] == a2[j] && a2[j] == a3[k])
             {   System.out.print(a1[i]+" ");   i++; j++; k++; }
 
             else if (a1[i] < a2[j])
                 i++;
 
             else if (a2[j] < a3[k])
                 j++;
 
             else
                 k++;
	    }

		System.out.println();
	   System.out.println();
	}

//Rearrange the positive and negative numbers

		void rearrange(){
		int array[]={1,5,-10,3,-6,-4,6,8,-12};
		int t=array.length;
		int j = 0, temp;
		System.out.println("Rearrange the positive and negative numbers ");
		System.out.print("Original array is : ");
		for (int i = 0; i < t; i++){
            System.out.print(array[i] + " ");
		}
		System.out.println(" "); 
		System.out.print("Rearranged : ");
        for (int i = 0; i < t; i++) {
            if (array[i] < 0) {
                if (i != j) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
		Arrays.sort(array);
		for (int i = 0; i < t; i++){
            System.out.print(array[i] + " ");}
			System.out.println();
        	System.out.println();
	 }
		
//Sum and Product of all the elements in array
		void sumProdduct(){
		int value[]={1, 2, 3, 4, 5};  
        int sum = 0,product = 1;
        for (int i = 0; i < value.length; i++) {  
           sum = sum + value[i]; 
		   product=product* value[i];
		}
		 System.out.println("Sum and Product of all the elements in array ");
		 System.out.println("Sum of the array is : "+sum);
		 System.out.println("Product of the array is : "+product);
		System.out.println();
        System.out.println();
		 }
		
	}

