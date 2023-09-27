package java2.day3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		//String test = {"one","two"};
		String[] arr = new String[] {"one","two","three"};
		Arrays.sort(arr);
		
		System.out.println("================");
		for(String s: arr) {
			System.out.println(s);
		}
		ArrayList<String> list =new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println("================");
		for(String s: list) {
			System.out.println(s);
		}
		
		//배열을 스트림으로
		Stream<String> stream1 = Arrays.stream(arr);
		Stream<String> stream2 = list.stream();
		
		System.out.println("================");
		stream1.sorted().forEach(s->System.out.println(s));
		
		System.out.println("================");
		stream2.sorted().forEach(s->System.out.println(s));
		
		
		
	}

}
