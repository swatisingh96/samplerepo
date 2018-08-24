import java.io.FileWriter;
import java.io.IOException;

public class DemoChecked {
// checked is an exception thrown at compilation, whereas unchecked is thrown at run time
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				FileWriter write = new FileWriter("hello.txt");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}

	}

}
