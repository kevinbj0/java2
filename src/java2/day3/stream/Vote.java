package java2.day3.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Vote {
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader reader = new BufferedReader(new FileReader("src/java2prj1/day3/stream/vote.txt"));
		ArrayList<String> list = new ArrayList<>();

		String str = "";
		while ((str = reader.readLine()) != null) {
			list.add(str);
		}

		//
		System.out.println(list.size());

		Stream<String> stream = list.stream();

		long count = stream.filter(s -> s.trim().equalsIgnoreCase("Y")).count();

		Thread.sleep(3000);
		System.out.println("결과======>");
		System.out.println(count);
	}
}
