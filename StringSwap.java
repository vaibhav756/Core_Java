class StringSwap
{
   public static void main(String... args)
   {
      String name="Vaibhav";  //7
	  String surname="Yadav";  //5
	  name=name+surname;    //12
	  surname=name.substring(0,name.length()-surname.length());  //7
	  name=name.substring(surname.length());  //5
	  System.out.println("Name is "+name+" and surname is "+surname);
   }
}