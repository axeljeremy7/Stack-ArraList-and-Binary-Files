

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class Application implements IApplication {
	private String str;// to return each sentence in reverse
	private IList lista;// to save the sentence of the input.bin
	private IList chara;// used for reversed words 
	private IStack stack;// to reverse the each words of the sentences
    
	/**
	* Reads the binary file "input.bin" 
	* returns each line as a string element in an IList
	* @return an IList containing the string input.
	*/
	@Override
	public IList readInputFile() {
		lista = new ArrayList();
		try {
			FileInputStream fstream1 = new FileInputStream("input.bin");
			DataInputStream inputFile1 = new DataInputStream(fstream1);
			boolean endOfFile1 = false;
			while (!endOfFile1) {
				try {						
							lista.add(inputFile1.readUTF());
				} catch (EOFException k) {
					endOfFile1 = true;
				}
			}	
			inputFile1.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	/**
	* Writes the reversed string to the binary file "output.bin" 
	* @param output  , This receive the reverse sentences
	* 
	*/
	@Override
	public void writeOutputFile(IList output) {
		
		try{
			FileOutputStream fstream = new FileOutputStream("output.bin"); 
			DataOutputStream outputFile =new DataOutputStream(fstream);
			for (int i = 0; i < output.size(); i++)
				outputFile.writeUTF(output.get(i));
			outputFile.close();
		}catch(IOException e ){
			System.out.println(e.getMessage());
		} 
	}
    /**
     * print to the screen the reverse string  and the no reverse string
     * @param input :the string that is no reverse
     * @param output :the sting reversed
     */
	@Override
	public void printToScreen(String input, String output) {
		System.out.println("The reverse of string \"" + input + "\" is \"" + output + "\".");
	}
	
	/**
	* Reverses the String parameter.
	* @param s the String to be reversed 
	* @return a string :the reversed string
	*/
	@Override
	public String reverseString(String s) {
		str = "";
		char[] ch = s.toCharArray();// converting into characters
		chara = new ArrayList();
		stack = new Stack();
		for (int i = 0; i < ch.length; i++) {
			chara.add(ch[i] + "");// make char to string
			stack.push(chara.get(i));// adding to stack
		}
		for (int i = 0; i < chara.size(); i++) {// reversing
			str = str + stack.peek();
			stack.pop();
		}
		return str;
	}

}
