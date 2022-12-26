package test.graphic;

public class GraphicMain {

	public static void main(String[] args) {

//		Graphic_A g_A = new Graphic_A();
//		g_A.brightness_A(80);
//		g_A.contrast_A(90.3);
//		g_A.display_A();
//		
//		Graphic_B g_B = new Graphic_B();
//		g_B.brightness_B(80);
//		g_B.contrast_B(90.3);
//		g_B.display_B();
		
		Graphic g1 = new Graphic_B();
		g1.brightness(80);
		g1.contrast(90.3);
		g1.display();
		
		Graphic g2 = new Graphic_A();
		g2.brightness(80);
		g2.contrast(90.3);
		g2.display();
	}

}
