class VariableLenArgu
{
	public static void main(String args[])
	{
		System.out.print("\nProgram to display the variable length Arguments passing ....\n");
		VariableArgu va = new VariableArgu();
		System.out.print("\nOnly one Arguments ------\n");
		va.print_arguments("mohan");
		System.out.print("\nMultiple Arguments ------\n");
		va.print_arguments("lakshmi\n", "narasimha\n", "mohan\n");

	}
}

class VariableArgu
{
	void print_arguments(String... str)
	{
		for(String s:str)
			{
				System.out.print(s);
			}
	}
}