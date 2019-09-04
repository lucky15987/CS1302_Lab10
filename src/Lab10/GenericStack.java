/* Class: CS1302-03
 * Name: Ethan Nguyen || Michael Noel
 * Lab: Lab10
 * Instructor: Monisha Verma
 */
package Lab10;

public class GenericStack<E>
{
	@SuppressWarnings("unchecked")
	private E[] list = (E[]) new Object[10];
	private int size = 0;
	
	
	//return size
	public int getSize()
	{
		return size;
	}
	
	//see the top element
	public E peek()
	{
		return list[size - 1];
	}
	
	//move an element to the top of stack
	public void push(E o) 
	{
		if (size >= list.length) 
		{
			doubleList();
		}
		else
		{
			list[size++] = o;
		}
	}
	
	//remove the top element from the stack
	public E pop()
	{
		E o = list[--size];
		return o;
	}
	
	//test if the stack is empty
	public boolean isEmpty()
	{
		return size == 0;
	}

	//create a new array that is double the current array size and copy the element form the current array to the new array
	@SuppressWarnings("unchecked")
	private void doubleList() 
	{
		// TODO Auto-generated method stub
		E[] tempList = (E[]) new Object[list.length * 2];
		System.arraycopy(list, 0, tempList, 0, list.length);
	}
	
	@Override //Override the super toString()
	public String toString()
	{
		return "Stack: " + list.toString();
	}
}
