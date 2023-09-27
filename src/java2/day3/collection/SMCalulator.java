package java2.day3.collection;

public class SMCalulator implements CalculatoI{
	
	@Override
	public int add(int a, int b) {
		System.out.println("SM");
		return a+b;
	}
	@Override
	public int sub(int a, int b) {
		System.out.println("SM");
		return a-b;
	}

}
