class KthSmallestElement
{
   public static void main(String... args)
   {
      int arr[]={12,45,85,75,96,27,65,23,78};
	  int Kth=3
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
	  System.out.println(Arrays.toString(arr));
	  
   }
}