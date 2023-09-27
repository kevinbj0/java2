package java2.interfaceEx.printer;

public class ThreeDPrinterPlastic {

	private Plastic material;
	
	public void setMaterial(Plastic material) {
		this.material = material;
	}

	public Plastic getMaterial() {
		return material;
	}
	
	public void print() {
		System.out.println("3D use : " + material);
	}
}
