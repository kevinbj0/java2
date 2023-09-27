package java2.day3.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Test {

	public static void main(String[] args) {
		List<String> list = null;
		ArrayList<String> alist = new ArrayList<>();
		
		alist.add("one");
		alist.add("two");
		alist.add("three");
		list = alist;
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("one");
		llist.add("two");
		llist.add("three");
		
		list = llist;
		list.forEach(item -> System.out.println(item));
	}

}
