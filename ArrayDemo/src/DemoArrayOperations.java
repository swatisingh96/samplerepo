import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers= {1,2,3,4,5,6,7,8,9,10};
		Arrays.fill(numbers,0);
		for (int num: numbers) {
	//
			System.out.println(numbers[num]);
		}
		Arrays.fill(numbers, 1,3,100);
		for (int num: numbers) {
			
	//		System.out.print(num);
		}
		
		System.out.println("-------- SORTING --------");
		
		Arrays.sort(numbers);
		
		for (int num : numbers) {
//			System.out.println(num+"\t");
			
		}
		int [] numbers1= {1,2,3,4,5,6,7,8,9,10};
		int index = Arrays.binarySearch(numbers1,1);
		System.out.println(index);
		
		
	}

}
