
public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("no. of args"+args.length);
		System.out.println("arguments:-"+args[0]+"\t"+args[1]+"\t"+args[2]);
		int sum=0;
		for(String x:args) {
			sum=sum+Integer.parseInt(x);
			System.out.println(sum);
			
		}
	}

}
