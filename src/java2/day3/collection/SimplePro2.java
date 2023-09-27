package java2.day3.collection;

import java.util.Scanner;

public class SimplePro2 {
	//의존성
	private CalculatoI cal;
	
	public void setCal(CalculatoI cal) {
		this.cal = cal;
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계산기 프로그램");
		
		System.out.println("첫번째 수 ");
		int su1 = sc.nextInt();
		
		System.out.println("두번째 수 ");
		int su2 = sc.nextInt();
		
		int result = cal.add(su1,su2);
		System.out.println(result);
	}
	public static void main(String[] args) {
		SimplePro2 p = new SimplePro2();
		p.setCal(new LGCalulator());
		p.run();
		
		
	}

}
