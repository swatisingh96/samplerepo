import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			FileReader reader = new FileReader("myfile.txt");
			//filewr.write("city,pune");
			//System.out.println("file created and data entered");
			byte valu =0;
			do {
				int data = reader.read();
				System.out.println((char)data);
				valu= (byte)data;
				
			}
			while(valu!=-1);
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
