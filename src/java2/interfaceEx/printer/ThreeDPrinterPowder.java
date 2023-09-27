package java2.interfaceEx.printer;

public class ThreeDPrinterPowder {

	private Powder material;
	
	public void setMaterial(Powder material) {
		this.material = material;
	}

	public Powder getMaterial() {
		return material;
	}
	
	public void print() {
		System.out.println("3D use : " + material);
	}
}
