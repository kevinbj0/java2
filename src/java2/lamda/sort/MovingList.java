package java2.lamda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

import java2.interfaceEx.myarrys.Score;


public class MovingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Moving> list = new ArrayList<>();
		list.add(new Moving("장주원", "구룡포",100));
		list.add(new Moving("이미현", "경기",80));
		list.add(new Moving("김두식", "문산",90));
		list.add(new Moving("전영석", "봉평",70));
		
		list.forEach(m->System.out.println(m));
		//이름순으로 정렬
		Collections.sort(list);
		System.out.println("========= 정렬 후 =========");
		list.forEach(m->System.out.println(m));
		
		class ConsumerImp implements Consumer<Moving>{
			@Override
			public void accept(Moving t) {
				System.out.println(t);
			}
		}
		System.out.println("=========================");
		list.forEach(new ConsumerImp());
		
		//암호순 정렬
		class ComparatorImp implements Comparator{
			@Override
			public int compare(Object o1, Object o2) {
				Moving s1 = (Moving) o1;
				Moving s2 = (Moving) o2;
				return s1.power - s2.power;
			}
		}
		list.forEach(new ConsumerImp());
		
		// 암호순 정렬
//	      System.out.println("암호순=============");
//	      
//	      list.sort(new Comparator<Moving>() {
//	         @Override
//	         public int compare(Moving o1, Moving o2) {
//	            return o1.code.compareTo(o2.code);
//	         }
//	      });
//	      list.forEach(new ConsumerImp());
		//파워순 정렬
		System.out.println("=========================");
		//암호순
		Collections.sort( list,  ( o1, o2)-> o1.code.compareTo(o2.code));
		list.forEach(new ConsumerImp());
		
		System.out.println("=========================");
		//파워순
		Collections.sort( list, ( o1, o2) -> o1.power- o2.power);
		list.forEach(new ConsumerImp());
	}

}
