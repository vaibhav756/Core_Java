class ArrayElementOccurrence
{
	public static void main(String... args)
	{
		int arr={12,45,85,44,12,85,11,35,12};
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=0;j<arr.length;j++)
			{
			  	if(arr[i]==arr[j] && i!=j)
				count++;
			}
			System.out.println(arr[i]+" occurrence: "+count);
		}
	}
}