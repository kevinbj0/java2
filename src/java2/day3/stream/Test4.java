package java2.day3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {
		IntStream intstream = IntStream.range(1,10);
		System.out.println("===============");
		intstream.skip(3).limit(5).forEach(num -> System.out.println(num));
		
		//중복된 것 제거
		System.out.println("===============");
		IntStream intStream2 = IntStream.of(1,2,2,3,4,4,5,6,7);
		intStream2.distinct().forEach(num -> System.out.print(num + ", "));
		
		//filter로 조건에 맞는것만 선택
		System.out.println("\n===============");
		IntStream intStream3 = IntStream.range(1, 10);
		intStream3.filter(i->i%2 ==0).forEach(num->System.out.print(num + ", "));
	}

}
