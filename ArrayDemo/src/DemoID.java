
public class DemoID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers;
		numbers = new int[5];
		numbers[0]=1;
        numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=4;
		
		int sum=0;
		for (int i=0;i<numbers.length; i++)
		{
			sum = sum + numbers[i];
			System.out.println(numbers[i]+"\t" +"sum:-"+sum);
			
		}
		
		// for each loop -- 1.8 version
		for(int x: numbers) {
			System.out.println(x);
		}
	}

}
