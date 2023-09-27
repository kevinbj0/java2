package java2.day3.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader ( new FileReader("src/java2/day3/stream/text.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String str="";
		while( ( str = reader.readLine())  != null ) {
			list.add( str);			
		}
		System.out.println(list.size());
		
		Stream<String> stream = list.stream();
		
		long count = stream.filter(s->s.equals("김재열")).count();
		System.out.println("김재열 : " + count);
	}

}
