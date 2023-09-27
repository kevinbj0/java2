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

public class BookTest {

	public static void main(String[] args) throws IOException {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("웃긴책",2000));
		list.add(new Book("진짜 웃긴책",3000));
		list.add(new Book("진짜 진짜 웃긴책",5000));
		list.add(new Book("무서운책",7000));
		
		Stream<Book> stream = list.stream();
		stream.filter(book->book.getPrice()>=2000).forEach(item -> System.out.println(item.getName()));
		
		stream = list.stream();
		stream.sorted((o1,o2)->o1.getPrice()-o2.getPrice()).forEach(item->System.out.println(item.getName()));
	}

}
