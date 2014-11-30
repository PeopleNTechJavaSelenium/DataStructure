package ds;

import java.util.ArrayList;
import java.util.List;

public class UseList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("New York");
		list.add("Boston");
		list.add("Denver");
		
		for(String st:list){
			System.out.println(st);
		}
	}

}
