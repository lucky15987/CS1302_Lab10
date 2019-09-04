/* Class: CS1302-03
 * Name: Ethan Nguyen || Michael Noel
 * Lab: Lab10
 * Instructor: Monisha Verma
 */
package Lab10;

public class TestGenericMax 
{
	//method returns the max element in a 2d array
	public static <E extends Comparable<E>> E max(E[][] list) 
	{
		E max = list[0][0];
		for (int i = 0; i < list.length; i++) 
		{
			for (int j = 0; j < list[i].length; j++) 
			{
				if (list[i][j].compareTo(max) > 0)
					max = list[i][j];
			}
		}
		return max;
	}
}
