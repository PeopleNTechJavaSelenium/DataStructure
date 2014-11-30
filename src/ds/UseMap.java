package ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {

	public static void main(String[] args) {
		
//		List<String> listOfUSA = new ArrayList<String>();
//		listOfUSA.add("New York");
//		listOfUSA.add("Boston");
//		listOfUSA.add("Denver");
		ListOfUSACity listOfUSA = new ListOfUSACity();
		
		List<String> listOfUK = new ArrayList<String>();
		listOfUK.add("London");
		listOfUK.add("Manchester");
		listOfUK.add("Birminghapton");
		
		List<String> listOfCanada = new ArrayList<String>();
		listOfCanada.add("Toronto");
		listOfCanada.add("Montreal");
		listOfCanada.add("Alberta");
		
		
		Map<String, List<String>> map = new LinkedHashMap<String,List<String>>();
		map.put("USA", listOfUSA.getListOfUSACityNames());
		map.put("UK", listOfUK);
		map.put("Canada", listOfCanada);
		
		for(Entry<String, List<String>> entry:map.entrySet()){
			
			System.out.println(entry.getKey()+" : "+ entry.getValue());
			
		}
		

	}

}
