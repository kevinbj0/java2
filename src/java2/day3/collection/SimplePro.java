package java2.day3.collection;

import java.util.Scanner;

public class SimplePro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계산기 프로그램");
		
		System.out.println("첫번째 수 ");
		int su1 = sc.nextInt();
		
		System.out.println("두번째 수 ");
		int su2 = sc.nextInt();
		
		CalculatoI cal = new LGCalulator();
		int result = cal.add(su1,su2);
		System.out.println(result);
		
		
	}

}
