

import java.io.IOException;


public class TestClassLab6 {

	public static void main(String[] args) throws IOException {
		Application app = new Application();
		IList inputStrings = app.readInputFile();
		IList reversedStrings = new ArrayList();
		inputStrings.add(2, "String added to index 2");
		for (int i = 0; i < inputStrings.size(); i++) {
			reversedStrings.add(app.reverseString(inputStrings.get(i)));
			app.printToScreen(inputStrings.get(i), reversedStrings.get(i));
			}
		app.writeOutputFile(reversedStrings);
	}


}
