import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class DemoConcurrentHashMap {

	public static void main(String[] args) {
		Map<String, String> map  = new ConcurrentHashMap<>();
		map.put("citi", "Pune");
		map.put("wipro", "Hinjewadi");
		map.put("Accenture", "Malad");
		map.put("xyz", "Bhopal");
		System.out.println(map);
		
		Set<Entry<String, String>> entries= map.entrySet();
		Iterator<Entry<String, String>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			Entry<String,String> entry = iterator.next();
			System.out.println(entry.getKey()+"::"+entry.getValue());
			if(entry.getKey().equals("citi"));
			map.put("TCS", "Chennai");
		}
	}

	}


