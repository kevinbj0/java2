package java2.interfaceEx.generic;

public class OListTest {

	public static void main(String[] args) {
		OList list = new OList();
		list.add(new Score("김재열", 71,96));
		list.add(new Score("박태민", 88,92));
		list.add(new Score("김민지", 75,77));
		list.add(new Score("김병진", 91,88));
		
		for(int i = 0; i<list.size(); i++ ) {
			System.out.println(list.get(i));
			
			Object obj = list.get(i);
			System.out.println(((Score)obj).getKor());
		}
	}

}
