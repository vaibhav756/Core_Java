class ReverseEachWordInString
{
   public static void main(String... args)
   {
	   String name="Vaibhav Kamlakar Yadav";
	   String words[]=name.split("\\s");
	   for(int i=0;i<words.length;i++)
	   {
		   String word=words[i];
		   for(int j=word.length()-1;j>=0;j--)
		   {
			   System.out.print(word.charAt(j));
		   }
		   System.out.print(" ");
	   }
   }
}