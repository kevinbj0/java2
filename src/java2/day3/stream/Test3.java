package java2.day3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("hi");
		list.add("hello");
		list.add("hello");
		list.add("bye");
		list.add("hello");
		
		Stream<String> stream1 = list.stream();
		stream1.filter(str -> str.equals("hello")).forEach(s->System.out.println(s));
		
		//스트림은 사용하고 나면 닫힘
		stream1 = list.stream();
		long result = stream1.filter(str->str.equals("hello")).count();
		System.out.println(result);
		
		stream1 = list.stream();
		stream1.filter(str->str.equals("hello")).limit(2).forEach(s->System.out.println(s));
	}

}
