class ConstructorOverloading 
{
	
   ConstructorOverloading() 
   { 
     System.out.println("Hello, I am a Constructor with no parameter.");
   }

   ConstructorOverloading(String name) 
   {
     System.out.println("Hello, I am a Constructor with one parameter, name = " + name);	
   }

public static void main(String[] args) 
	{
  		ConstructorOverloading p1 = new ConstructorOverloading();
  		ConstructorOverloading p2 = new ConstructorOverloading("Dr. Saket"); 
	}
}  