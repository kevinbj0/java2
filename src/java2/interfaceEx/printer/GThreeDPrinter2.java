package java2.interfaceEx.printer;

//제네릭 클래스 만들기 , <> : 다이아몬드 연산자
//들어올 수 있는 타입을 제한한 버전
public class GThreeDPrinter2<T extends Material> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public void print() {
		System.out.println("3D print " + material);
	}
}
