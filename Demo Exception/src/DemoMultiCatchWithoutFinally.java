import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoMultiCatchWithoutFinally {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try(FileInputStream fi = new FileInputStream("abc.txt");)
		{
			ObjectInputStream oo =  new ObjectInputStream(fi);
			oo.readObject();
		}  catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
