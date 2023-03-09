package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemoExample {

	public static void main(String[] args) {
		ArrayList <Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(90);
		list.add(90);
		list.add(96);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.set(3, 56));
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println("========================================================================");
		Iterator<Integer>it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
