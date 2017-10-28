package in.vamsoft.training.corejava;

import java.util.*;

public class DictionaryMap {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap();
		map.put("ability","capacity,power,potential");
		map.put("awake","sleepless");
		map.put("bloom","blossom,flower");
		map.put("brilliant","very bright");

		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the word to be searched");
			System.out.println(map.get(s.next()));
			
		}
	/*	System.out.println(map.put(3,"Rita"));
		System.out.println(map);
		System.out.println(map.get(3));
		
		if(!map.containsKey(5))
				{
			
				}
		*/

	}

}
