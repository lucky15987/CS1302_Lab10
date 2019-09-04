/* Class: CS1302-03
 * Name: Ethan Nguyen || Michael Noel
 * Lab: Lab10
 * Instructor: Monisha Verma
 */
package Lab10;

public class TestGenericStack 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//create a stack to hold 3 string values
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		
		//crate a stack that holds Integers
		GenericStack<Integer> stack2 = new GenericStack<>();
		for(int i = 0; i < 100; i++)
		{
			stack2.push(i + 1);
		}
		
		//Display elements in stack 1 and 2
		System.out.println("Stack 1: ");
		while (!stack1.isEmpty())
		{
			System.out.print(stack1.pop() + " ");
		}
		System.out.println("\n");
		
		System.out.println("Stack 2: ");
		for (int i = 1; !stack2.isEmpty(); i++) 
		{
			if (i % 10 == 0)
			{
				System.out.println(stack2.pop());
			}
			else
			{
				System.out.print(stack2.pop() + " ");
			}
		}
		System.out.println();
	}

}
