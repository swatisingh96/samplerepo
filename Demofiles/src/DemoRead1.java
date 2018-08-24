import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 try {
		 System.out.println("please enter your name");
		 String name= br.readLine();
		 System.out.println("You entered:-"+name);
		 
		 
	 }
	 catch (IOException e) {
		 e.printStackTrace();
	 }
	}

}
