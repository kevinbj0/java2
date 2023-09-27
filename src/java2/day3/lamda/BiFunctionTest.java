package java2.day3.lamda;

import java.util.function.BiFunction;

/*
 * 두 개 매개변수, 하나의 반환
 * 이름, 성적 -> 학점
 */
public class BiFunctionTest {

	public static void main(String[] args) {

		Student s1= new Student("학생1",90);
		Student s2= new Student("학생2",50);
		
		
		BiFunction<Student,Student,String> getGrade = (o1,o2)->{
			
			calGrade(o1);
			calGrade(o2);
			return o1.toString() +"\n"+ o2.toString();
		};
		String result = getGrade.apply(s1, s2);
		System.out.println(result);
	}
	public static void calGrade(Student s){
        if (s.score >= 90) {
            s.setGrade("A");
        } else if (s.score >= 80) {
            s.setGrade("B");
        } else if (s.score >= 70) {
            s.setGrade("C");
        } else {
            s.setGrade("F");
        }
    }

}
