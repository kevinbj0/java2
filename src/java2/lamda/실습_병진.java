package java2.lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class 실습_병진 {

	public static void main(String[] args) {
		System.out.println(1);
		Runnable r = () -> System.out.println("집밥해먹기");
		r.run();
		
		System.out.println("======= 2번 장보기 =======");
		ArrayList<Good> list2 = new ArrayList<Good>();
		list2.add(new Good("앞다리살 1근", 15000));
		list2.add(new Good("다진마늘(대량)", 8000));
		list2.add(new Good("간장 1L", 3000));
		list2.add(new Good("메로나", 500));
		Consumer<Integer> c = t -> {
			int i = 0;
			while(true) {
				for(Good item : list2) {
					if((t/item.price) == 0)
						continue;
					
					t -= item.price;
					item.count++;
				}
				
				//가격순으로 정렬된 마지막 배열의 값보다 작거나 같을시 빠져나감
				if(t<=list2.get(list2.size()-1).price) 
					break;
			}
			//최종 개수 및 구매 출력ㄴ
			for(Good item : list2) {
				System.out.println(item.name + "을(를) " + item.count + "개 구매");
			}
		};
		c.accept(30000);
	}

}
