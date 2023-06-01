class OccuranceOfCharacter
{
  public static void main(String... args)
  {
     String name="Vaibhav Yadav";
	 char character='a';
	 int count=0;
	 for(char x:name.toCharArray())
	 {
	    if(character==x)
		count++;
	 }
	 System.out.println("Number of occurance of character 'a' is "+count);
  }
}