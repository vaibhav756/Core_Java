import java.util.*;
class SortingStringArray
{
  public static void main(String... args)
  {
    String[] names={"vaibhav","rohan","ketan","amar","jayesh"};
	Arrays.sort(names);
	for(int i=0;i<names.length;i++)
	{
		String temp="";
		for(int j=i+1;j<names.length;j++)
		{
			if(names[i].compareTo(names[j])>0 && i!=j)
			{
				temp=names[j];
				names[j]=names[i];
				names[i]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(names));
  }
}