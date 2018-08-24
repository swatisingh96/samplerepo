import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoMultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fi =null;
		try {
			 fi = new FileInputStream("abc.txt");
			ObjectInputStream oo = new ObjectInputStream(fi);
			oo.readObject();
			fi.close();
		} catch (IOException | ClassNotFoundException e) {
	
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			
			try {
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
