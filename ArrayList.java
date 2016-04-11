package edu.wmich.cs1120.spring16.la6.tts5535.lists;

public class ArrayList implements IList {
	private String[] str=new String[3];// the size initilized here does not matter because this is going to be affected by add methods
	private int size=0;// initiliaze at zero
	
	/**
	* Adds the element e to the end of the list. 
	* @param e element to be added
	* each time is adding, is incrementing by two the size
	*/

	@Override
	public void add(String e) {
		int newCapacity=0;
		if( size +1> str.length ){
			newCapacity = str.length*2;
			if (newCapacity < size +1) {
			    newCapacity = size +1;// if after duplicating the size if not enough, assigned the currently size
		     }
			String [] temp = new String[newCapacity];
			for(int i=0; i< size; i++){
				temp[i]= str[i];
			}
			str=temp;// the reference assigned to increment and know the size
		}
		str[size++]=e;
	}
	
	/**
	* Adds the element e to the end of the list.
	* @param index of the location to place the string, starting from 0 
	* @param e element to be added
	* Shift the index from the last index and element to the index which is the input
	* Shift from end to the begining(index parameter)
	*/
	@Override
	public void add(int index, String e) throws IndexOutOfBoundsException {
		String [] temp = new String[size+1];
		for(int i=0; i< size; i++){
			temp[i]= str[i];
		}
		str=temp;
        size=size+1;
		for(int i =1; i<size - index; i++){
			str[size-i]=str[size-i-1];
		}
		str[index]=e;
	}
	
	 /**
     * Removes all of the elements from the list
     * becuause the variblae size is available  in the class
     * if enough to chekc is the size to assign the size to zero.
     */
	@Override
	public void clear() {
		size=0;
	}
	
	/**
	* Checks to see if list contains the parameter  s 
	* @param s string parameter to search for.
	* @return a boolean: true if found, false otherwise.
	*/

	@Override
	public boolean contains(String s) {
		for(int i=0; i<size;i++){
			if(str[i].equals(s)) {
				return true;
			}	
		}
		return false;
	}
	
	/**
	* @return the element at the front (index 0) of the list
	*/
	@Override
	public String getHead() {
		return str[0];
	}
	/**
	* @return the element at the back (index size-1) of the list.
    */
	@Override
	public String getTail() {
		return str[size -1];
	}
	
	/** 
	* @param index (an integer) : index of the element to retrieve, starting from 0.
    * @return a string , the element at that index.
	* @throws IndexOutOfBoundsException : if the index is out the size-1
	*/
	@Override
	public String get(int index) throws IndexOutOfBoundsException {
		return str[index];
	}
	
	/**
	* Search  the string element s in the list and returns the 
	* index of the first occurrence, starting from index 0
	* @param s, a string: parameter to search for
	* @return index of the element, or -1 if not found.
	*/
	@Override
	public int indexOf(String s) {
		int i;
		for(i=0; i<size; i++){
			if(str[i].equals(s)){
				return i;
			}
		}
		return -1;
	}
	
	/**
	* @return true if the list is empty, false otherwise.
	* if enough to check the size because this variable change dinamically
	*/
	@Override
	public boolean isEmpty() {	
		return (size ==0);
	}
	
	/**
	* Removes the element at the specified index.
	* @param index index of element to be removed, starting from index 0 
	* @return a string element which contain the element that was removed.
	* @throws IndexOutOfBoundsException : if the index is out the size-1
	*/
	@Override
	public String remove(int index) throws IndexOutOfBoundsException {
		for(int i =index; i<size-1; i++){
			str[i]=str[i+1];
		}
		size=size-1;
		return str[index];
	}
	/**
	* @return the number of elements in this list. 
	* */
	@Override
	public int size() {
		return size;
	}

}
