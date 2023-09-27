package java2.day3.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		//방법1
		for(String s:list) {
			System.out.println(s);
		}
		
		//방법2
		list.forEach(item -> System.out.println(item));
		
		//방법3
		list.forEach(new Consumer<>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  1
		//요소1,요소2-> 정렬할 리스트, 정렬의 기준
		Collections.sort(list,new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		System.out.println("==> 정렬 후 ");
		//해보기 : 객체배열도 이거 적용되는지
		list.forEach(item -> System.out.println(item));
	}
}
