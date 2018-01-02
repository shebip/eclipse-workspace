package in.vamsoft.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExercise {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Red");
    list.add("Blue");
    list.add("Pink");
    list.add(0,"White");
    list.add(3,"Pink");
    Iterator<String> itr = list.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());

    }
    System.out.println(list.get(2));

  }

}
