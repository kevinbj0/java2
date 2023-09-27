package java2.interfaceEx.generic;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Score("이윤정",90,100));
		list.add(new Score("이정훈",100,90));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
