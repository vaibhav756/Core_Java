class ArrayUniqueElements
{
   public static void main(String... args)
   {
       int arr[]={12,41,35,18,12,58,35,42,58};
	   int main[]=new int[arr.length];
	   int unique=0;

	   for(int i=0;i<arr.length;i++)
	   {
		   int count=0;
		   for(int j=0;j<arr.length;j++)
		   {
			   if(arr[i]==arr[j] && i!=j)
			   {
				   count++;
				   break;
			   }
		   }
		   if(count==0)
		   {
		   System.out.print(arr[i]+" ");           		   
		   }
	   }	   
   }
}