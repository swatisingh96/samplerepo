import java.util.TreeSet;
import java.util.NavigableSet;

public class DemoNavigableSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<String> set = new TreeSet();

		set.add("citi");
		set.add("wipro");
		set.add("accenture");
		System.out.println(set);
		System.out.println(set.headSet("citi", true));
		System.out.println(set.tailSet("accenture", false));
	}

}
