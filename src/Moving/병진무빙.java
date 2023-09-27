package Moving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class 병진무빙 {

	public static void main(String[] args) {
		ArrayList<Moving> list = new ArrayList<>();

		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", "문산", 90));
		list.add(new Moving("전영석", "봉평", 88));

		System.out.println("=================이름순=================");
		//방법1
		Collections.sort(list);  //Moving의 compareTo 사용하여 이름 순 정렬
		list.forEach(new Consumer<Moving>() {
			@Override
			public void accept(Moving t) {
				System.out.println(t);
			}
		});
		//방법2
		class ConsumerImp implements Consumer<Moving>{

			@Override
			public void accept(Moving t) {
				System.out.println(t);
			}
			
		}
		list.forEach(new ConsumerImp());
		
		System.out.println("=================암호순=================");
		
		
		
	}

}
