package java2.interfaceEx.printer;

public class ThreeDPrintTest {

	public static void main(String[] args) {
		ThreeDPrinterPlastic p = new ThreeDPrinterPlastic();
		p.setMaterial(new Plastic());
		p.print();
	}
}
