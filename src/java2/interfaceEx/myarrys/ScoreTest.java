package java2.interfaceEx.myarrys;

public class ScoreTest {

	public static void main(String[] args) {
		Score[] list = new Score[4];
		
		list[0] = new Score(100,90);
		list[1] = new Score(80,99);
		list[2] = new Score(99,87);
		list[3] = new Score(70,60);
		
		//객체배열 출력
		for(Score score: list) {
			System.out.println(score);
		}
		
		//국어점수가 낮은 순으로 정렬 (직접정렬, 선택정렬)
		for(int i = 0; i<list.length-1; i++) { //i=0,1,2
			for(int j=i+1; j<list.length; j++) { //j=1,2,3
				if(list[i].kor > list[j].kor) {
					Score tmp;
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
		}
		
		System.out.println("====>");
		
		for(Score score:list) {
			System.out.println(score);
		}
		
	}

}
