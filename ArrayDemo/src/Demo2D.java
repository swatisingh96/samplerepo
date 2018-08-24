
public class Demo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arrays ;
		arrays = new int[3][3];
		arrays[0][0]=1;
		arrays[0][1]=0;
		arrays[0][2]=0;
		
		arrays[1][0]=0;
		arrays[1][1]=1;
		arrays[1][2]=0;
		
		arrays[2][1]=0;
		arrays[2][1]=0;
		arrays[2][2]=1;
		//System.out.println(arrays.length);
	
		for (int i =0; i<arrays.length;i++) {
			for (int j=0; j<arrays[i].length; j++) {
				System.out.println(arrays[i][j]+"\t");
			}
			System.out.println();
			
		}
		
		
	}

}
