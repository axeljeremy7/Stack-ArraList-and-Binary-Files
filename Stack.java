package edu.wmich.cs1120.spring16.la6.tts5535.stacks;
import edu.wmich.cs1120.spring16.la6.tts5535.lists.ArrayList;
import edu.wmich.cs1120.spring16.la6.tts5535.lists.IList;

public class Stack implements IStack {
	
	private IList lista = new ArrayList(); 
	private int n=0;// for the size of the stack

	/**
	* Adds the parameter s to the top of the stack. 
	* @param s the string to be added
	* also at the end incremmenting the size
	*/
	@Override
	public void push(String s) {
		lista.add(s);
		n++;
	}

	/**
     * Removes the top element from the stack
     */
	@Override
	public void pop() {
		n = n-1;  
		lista.get(n);
		System.out.print("");
	}

	/**
	* Returns the top element without removing it.
	* @return the top element in the stack
	*/
	@Override
	public String peek() {	
		return lista.get(n-1);
	}
	/**
	* @return the number of elements in the stack
	*/
	@Override
	public int size() {
		return n;
	}
	/**
	* @return true if the stack contains no elements, false otherwise. 
	* the stack is empty is the size is zero.
	*/
	@Override
	public boolean isEmpty() {	
		return (n==0);
	}

}
