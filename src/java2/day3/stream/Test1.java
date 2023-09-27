package java2.day3.stream;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		
		HashSet<Integer> lottos = new HashSet<Integer>();
		Random r = new Random();
		
		for(int i=0; i<20; i++) {
			lottos.add(r.nextInt(46));
		}
		
		System.out.println(lottos.size());
		
		Object[] lottosArray = lottos.toArray();
		Integer[] result = new Integer[6];
		System.out.println("로또 번호!");
		
		//원본배열의 0번째부터 6개 복사해서 가져감
		System.arraycopy(lottosArray, 0, result, 0, 6);
		for(int i =0; i<result.length; i++) {
			System.out.print(result[i]+1 + " ");
		}
		
		IntStream is = new Random().ints(1,46);
		System.out.println("\nStream 로또 번호!");
		is.distinct().limit(6).sorted().forEach(number-> System.out.print(number + " "));
	}

}
