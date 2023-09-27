package java2.lamda;

//람다식 : 매서드(함수)를 간단한 식으로 표현하는 것
//익명함수라고도 한다.
//자바는 매서드만 존재할 수 없다. 반드시 클래스 필요
//자바는 인터페이스를 제공, 추상매서드가 한개인 인터페이스를 제공한다. => 함수형 인터페이스
//매서드를 간단한 식형태로 사용할 수 있게 한다.

/*
 * AddInterface
 * 	int add(int a,int b);
 */

@FunctionalInterface
interface AddInterface{
	int add(int a, int b);
}
public class AddInterfaceEx {
	public static void main(String[] args) {
		//1.
		class AddInterfaceImp implements AddInterface{
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		}
		AddInterfaceImp f1 = new AddInterfaceImp();
		int result1 =  f1.add(5, 3);
		System.out.println(result1);
		
		//2. 익명클래스 만드는 문법
		AddInterface f2 = new AddInterface() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}};
		int result2 = f2.add(5, 3);
		System.out.println(result2);
		
		//3.
		//AddInterface f3 = (int a, int b) -> {return a+b; };
		//익명클래스생성, 익명객체생성
		AddInterface f3 = (a, b) -> a+b;
		int result3 = f3.add(5, 3);
		System.out.println(result3);
		

		AddInterface f4 = (a, b) -> {
			int sum;
			sum = a+b;
			return sum;
		};
		int result4 = f4.add(5, 3);
		System.out.println(result4);
	}
}
