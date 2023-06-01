class MinMaxArray
{
  public static void main(String... args)
  {
     int arr[]={12,45,65,25,75,81,17,69,93,49};
	 int min=arr[0];
	 int max=arr[0];
	 for(int i=1;i<arr.length-1;i++)
	 {
	    if(arr[i+1]<min)
        min=arr[i+1];
        if(arr[i+1]>max)
        max=arr[i+1];			
	 }
	 System.out.println("Min value "+min);
	 System.out.println("Max value "+max);
  }
}