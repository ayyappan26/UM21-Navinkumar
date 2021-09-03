package assignment.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


class MapWork{
	HashMap<String,String> map=new HashMap<>();
	public HashMap<String,String> storeCountryCapital(String country,String capital){
		map.put(country, capital);
		return map;
		
	}
	public String retriveCapital(String country){
		return map.get(country);
	}
	public String retriveCountry(String capital){
		Set<Entry<String,String>> mapset=map.entrySet();
		Iterator<Entry<String,String>> it=mapset.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> m1=it.next();
			if(m1.getValue().equals(capital)){
				return m1.getKey();
			}
		}
		return null;
	}
	public HashMap<String, String> swapValue() {
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> mapset = map.entrySet();
		Iterator<Entry<String, String>> it = mapset.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			map2.put(me.getValue(), me.getKey());
		}
		
		return map2;
	}
}
public class CollectionMap {
	public static void  main(String arg[]){
		MapWork hashMap=new MapWork();
		HashMap<String,String> result=new HashMap<String,String>();
		hashMap.storeCountryCapital("India", "Delhi");
		hashMap.storeCountryCapital("Japan", "Tokyo");
		String str=hashMap.retriveCapital("India");
		System.out.println(str);
		String str1=hashMap.retriveCountry("Tokyo");
		System.out.println(str1);
		result=hashMap.swapValue();
		System.out.println(result);
		
		
	}

}
