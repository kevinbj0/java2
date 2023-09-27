package java2.lamda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class 실습_병진요리 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("닭꼬치 원없이 먹기");
		list.add("투자로 여행경비 만들기");
		list.add("3년 적금 만기까지 들고 가기");

		Runnable f = new Runnable() {
			@Override
			public void run() {
				for (String item : list) {
					System.out.println(item);
				}
			}
		};
		f.run();

		System.out.println("======= 2번 장보기 =======");
		ArrayList<Good> list2 = new ArrayList<Good>();
		list2.add(new Good("앞다리살 1근", 15000));
		list2.add(new Good("다진마늘(대량)", 8000));
		list2.add(new Good("간장 1L", 3000));
		list2.add(new Good("올때메로나", 500));
		
		//1개씩은 무조건 사야하며 남을 시 추가로 장을 보는 프로그램
		Consumer<Integer> f2 = new Consumer<>() {
			@Override
			public void accept(Integer t) {
				int i = 0;
				while(true) {
					for(Good item : list2) {
						if(t<item.price)
							continue;
						
						t -= item.price;
						item.count++;
					}
					
					//가격순으로 정렬된 마지막 배열의 값보다 작거나 같을시 빠져나감
					if(t<=list2.get(list.size()-1).price) 
						break;
				}
				//최종 개수 및 구매 출력ㄴ
				for(Good item : list2) {
					System.out.println(item.name + "을(를) " + item.count + "개 구매");
				}
			}
		};
		f2.accept(30000);
		
		
		System.out.println("======= 3번 요리만들기 =======");
		Supplier<String> s= () -> {
			System.out.println("기름을 두른 팬에 앞다리살 1근을 올린다");
			System.out.println("중불에 마이야르 반응을 일으킨다");
			System.out.println("서비스로준 월계수잎과 간장을 넣고 삶는다");
			System.out.println("올때 산 메로나를 먹는다.");
			return "70년 전통 수육";
		};
		String result = s.get();
		System.out.println(result);
		
		
	}
}
