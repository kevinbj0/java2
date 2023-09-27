package java2.interfaceEx.myarrys;

import java2.interfaceEx.myarrys.MyComparable;
import java2.interfaceEx.myarrys.Score;

public class 캐스팅연습 {
	public static void main(String[] args) {
		Score s = new Score(100,90);
		System.out.println(s);
		
		//1. 1번 가능?
		Object o = (Score)s;
		
		//2번
		MyComparableG<Score> m = (MyComparableG<Score>) s;
		
	}
}
