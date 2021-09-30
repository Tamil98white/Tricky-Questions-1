import java.util.*;
class arraynumbers 
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

		 
		 int positive = 0;
		 int negative = 0;
		 int zero = 0;
		 int add = 0, even = 0;
	     for (int num : array) {
         if (num > 0) {       
            ++positive;
	      } else if (num < 0) {  
		    ++negative;
		  } else {             
			++zero;
		  }

		 }
		for (int i=0;i<array.length;i++) {
		 if(array[i]%2!=0){  
				++add;	
			}
		 if(array[i]%2==0){
				++even;
			}  

		}
		
		System.out.println("Positive numbers = " + positive);
		System.out.println("Negative numbers = " + negative);
		System.out.println("Zeros = " + zero);
		System.out.println("add numbers = " + add);
		System.out.println("Even numbers = " + add);
		}else{
		System.out.println("Enter valid data ");
	}
	}
}
