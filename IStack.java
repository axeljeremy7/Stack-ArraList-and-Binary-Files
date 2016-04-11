package edu.wmich.cs1120.spring16.la6.tts5535.stacks;

public interface IStack {
	/**
	* adds the parameter s to the top of the stack. 
	* @param s the string to be added
	*/
	void push(String s); 
	/**
	* Removes the top element from the stack
	*/
	void pop(); 
	/**
	* Returns the top element without removing it.
	* @return the top element in the stack
	*/
	String peek();
	/** *
	* @return the number of elements in the stack
	*/
	int size();
	/**
	
	* @return true if the stack contains no elements, false otherwise. 
	* */
	boolean isEmpty();

}
