import java.util.*;
class MultiDimensionalArray
{
  static public void main(String... args)
  {
     int arr[][]=new int[2][2];
	 arr[0][0]=1;
	 arr[0][1]=2;
	 arr[1][0]=3;
	 arr[1][1]=4;
	 /*
	 for(int i=0;i<arr[0].length;i++)
	 {
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
        System.out.println();		
	 }*/

	 //System.out.println(arr.length);
	 
	 for(int i=0;i<arr.length;i++)
	 {
//		 System.out.println(Arrays.toString(arr[i]));
         for(int ar:arr[i])
		 {
			 System.out.print(ar+" ");
		 }
		 System.out.println();
	 }
	 
/*	 for(int ar[]:arr)
	 {
		 for(int x:ar)
		 {
			 System.out.print(x+" ");
		 }
		 System.out.println();
	 }*/
	 
  }
}