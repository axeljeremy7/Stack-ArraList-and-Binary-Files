
public interface IApplication {
	
	/**
	* reads the binary file "input.bin" and returns each line * as an element in an IList
	* @return an IList containing the input.
	*/
	public IList readInputFile();
	/**
	* Writes the reversed string to the binary file "output.bin"
    * @param output the reverse sentence
	*/
	public void writeOutputFile(IList output);
	default public void printToScreen(String input, String output){ 
		System.out.println("The reverse of string \""+input+ "\" is\""+output+"\".");
	      }
	/**
	* Reverses the String parameter.
	* @param s the String to be reversed
    * @return the reversed string
	*/
	public String reverseString(String s);

}
