import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoMultiCatchThrows {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("abc.txt");
		ObjectInputStream oo =  new ObjectInputStream(fi);
		oo.readObject();
	}

}
