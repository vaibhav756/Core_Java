import java.util.*;
class SortingArray
{
   public static void main(String... args)
   {
      int arr[]={75,12,45,78,35,26,24,85,79,95,37,14};
	  for(int i=0;i<arr.length;i++)
	  {
		  int temp=0;
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]>arr[j])
			  {
				  temp=arr[j];
				  arr[j]=arr[i];
				  arr[i]=temp;
			  }
		  }
	  }
	  System.out.println("Array in Ascending order: "+Arrays.toString(arr));
	  System.out.println("=================================================");
	  for(int i=0;i<arr.length;i++)
	  {
		  int temp=0;
		  for(int j=i+1;j<arr.length;j++)
		  {
			 if(arr[j]>arr[i])
			 {
				 temp=arr[j];
				 arr[j]=arr[i];
				 arr[i]=temp;
			 }				 
		  }
	  }
	  System.out.println("Array in Descending order: "+Arrays.toString(arr));
   }
}