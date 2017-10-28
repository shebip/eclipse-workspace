package in.vamsoft.training.corejava;

import java.util.*;


public class CollectionAlgoDemo { 
	
public static void main(String args[]) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(900);
		list.add(200);
		list.add(800);
		list.add(400);
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		List<Integer> list1=new ArrayList<>();
		list.add(100);
		
		Collections.fill(list1, 0);
		System.out.println(list1);
		
		Collections.sort(list);
		int position=Collections.binarySearch(list, 200);
		System.out.println(position);
		
	}

}
