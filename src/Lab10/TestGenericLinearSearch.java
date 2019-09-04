/* Class: CS1302-03
 * Name: Ethan Nguyen || Michael Noel
 * Lab: Lab10
 * Instructor: Monisha Verma
 */
package Lab10;

public class TestGenericLinearSearch 
{
	//generic method that returns comparable to a linear search
	public static <E extends Comparable<E>>	int linearSearch(E[] list, E key)
	{
		for (int i = 0; i < list.length; i++) 
		{
			if (key.compareTo(list[i]) == 0)
				return i;
		}
		return -1;
	}

}
