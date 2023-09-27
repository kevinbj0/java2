package java2.interfaceEx.myarrys;

import java.util.Arrays;

public class ScoreTestG {

	public static void main(String[] args) {
		Score[] list = new Score[4];
		
		list[0] = new Score(100,90);
		list[1] = new Score(80,99);
		list[2] = new Score(99,87);
		list[3] = new Score(70,60);
		
		//정렬 전
		for(Score score: list) {
			System.out.println(score);
		}
		
		MyArraysG.sort(list);
		
		//정렬 후
		System.out.println("===============영어 정렬 후=====");
		for(Score score : list) {
			System.out.println(score);
		}
		
	}

}
