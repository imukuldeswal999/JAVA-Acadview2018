import java.lang.String;
import java.util.*;
import java.util.Arrays; 

class Sort{
		public static <any_type> void printArr(any_type[] inputArr){
		
		
			for(any_type element : inputArr)
			{
			System.out.printf("%s",element);
			}
		
		System.out.println();
		}
	
		public static void main(String args[]){

			Integer[] arr={4,6,4,7,9,1};
			
			Arrays.sort(arr);
			 System.out.println("Modified arr[] = " + Arrays.toString(arr));
			 
			 String[] str={"Aman","Mukul","Rajan","Deepak","Akash"};
			 
			 Arrays.sort(str);
			  System.out.println("Modified str[] = " + Arrays.toString(str));
			  
			 double dub[]={2.2,3.22,4.45,5.67,9.87};
			 
			Arrays.sort(dub);
			  System.out.println("Modified dub[] = " + Arrays.toString(dub));
			  
							}
}

