
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrs = {12, 34,44,54,34,55,65,78,90,23,90};
		int x=0;
		boolean flag;
		flag = false;
		int search=54;
		while (x<arrs.length) {
			if(arrs[x]==54)	{		
				flag=true;
				break;}
			x++;
		}
		
		if (flag)
			System.out.println("found");
		else
			System.out.println("not found");
		/*int y=0;
		do {
			
			System.out.println(arrs[y]);
			y++;
		}
			while(y<arrs.length);
		*/
	}

}
