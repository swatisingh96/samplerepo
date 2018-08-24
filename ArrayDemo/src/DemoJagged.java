
public class DemoJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] values = new int [3][];
		values[0] = new int [1];
		values[1] = new int [2];
		values[2] = new int [3];
		
		values[0][0]=1;
		values[1][0]=0;
		values[1][1]=1;
		values[2][0]=0;
		values[2][1]=0;
		values[2][2]=1;
		
		for (int []x: values) {
			for(int y:x) {
				System.out.println(y+"\t");
			}
			System.out.println();
		}
		
	}

}
