package java2.day3.lamda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		//이름사용
		class A implements Runnable{
			@Override
			public void run() {
				System.out.println("람다식 시작1");
			}
		}
		A a = new A();
		a.run();
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  1
		//익명클래스
		Runnable rr = new Runnable() {
			@Override
			public void run() {
				System.out.println("람다식 시작2");
			}
		};
		rr.run();
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  2
		Runnable r = ()-> System.out.println("람다식 시작3");
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  3
		Runnable r2 = ()-> {
			String[] 할일 = {
					"산책하기",
					"람다식연습2개",
					"매서드연습"
			};
			System.out.println(Arrays.toString(할일));
		};
		
		r.run();
		r2.run();
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  4
		Consumer<Integer> c = money -> {
			int 소고기 = 15000;
			int 떡 = 2000;
			money-=소고기;
			money-=떡;
			System.out.println(money);
		};
		c.accept(20000);
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  5
		/*
		 * interface Supplier<T>{
		 * 	T get();
		 * }
		 */
		//반환값이 있는 아이
		Supplier<String> s = () -> {
			System.out.println("떡국을 끓인다.");
			
			return "떡국";
		};
		String food = s.get();
		System.out.println(food);
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  5
		/*
		 * interface Predicate<T>{
		 * 		boolean test(T t);
		 * }
		 */
		Predicate<String> p = foodName -> {
			if(foodName.equals("떡국")) {
				return true;
			}else
				return false;
		};
		boolean result10 = p.test("떡국");
		boolean result11 = p.test("파스타");
		System.out.println(result10);
		System.out.println(result11);
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  5
		Function<Integer,int[]> func = num ->{
			int[] gty = {5,3,5,1,2};
			gty[0] = num;
			return gty;
		};
		int[] result12 = func.apply(20);
		System.out.println(Arrays.toString(result12));
	}
}
