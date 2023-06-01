class RemoveVowels
{
	public static void main(String... args)
	{
		String name="Vaibhav Yadav";
		for(char x:name.toCharArray())
		{
			if(x!='a' && x!='e' && x!='i' && x!='o' && x!='u')
			System.out.print(x);	
		}
	}
}