class ArrayPair
{
  public static void main(String... args)
  {
     int arr[]={1,3,4,2,5,6,3,7};
	 for(int i=0;i<arr.length;i++)
	 {
	    int val=8;
	    for(int j=i+1;j<arr.length;j++)
		{
		   if(arr[i]+arr[j]==8)
		   System.out.println(arr[i]+" "+arr[j]+" == 8");
		}
	 }
  }
}
