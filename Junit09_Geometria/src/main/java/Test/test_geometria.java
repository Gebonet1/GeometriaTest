package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;
class test_geometria {

	Geometria geo=new Geometria();
	
	//Test Area Cuadrado
	
	@Test
	public void testAreaCuadrado() {
	int resultado=Geometria.areacuadrado(4);
	int esperado=16;
	assertEquals(resultado,esperado);
	
	
	}
 //Test Area Circulo
	@Test
	public void testAreaCirculo() {
		double resultado=Geometria.areaCirculo(5);
		double esperado=78.54;
		double delta=2;
	   assertEquals(resultado,esperado,delta);
		
	}
	//Test Area Triangulo
	@Test
	public void testAreatriangulo() {
		int resultado=Geometria.areatriangulo(5,6);
		int esperado=15;
	   assertEquals(resultado,esperado);
	
	}
	//Test Area Rectangulo
	
	@Test
	public void testAreaRectangulo() {
		int resultado=Geometria.arearectangulo(5,6);
		int esperado=30;
	   assertEquals(resultado,esperado);
	
}
	//Test Area Pentagono.
	@Test
	public void testareapentagono() {
		int resultado=Geometria. areapentagono(5,6);
		int esperado=15;
	   assertEquals(resultado,esperado);
}
	//Test Area Rombo.
	@Test
	public void testarearombo() {
		int resultado=Geometria. arearombo(2,10);
		int esperado=10;
	   assertEquals(resultado,esperado);
	   
	   
	   
}
	//Test Area Romboide
	@Test
	public void arearomboide() {
		int resultado=Geometria.arearomboide(2,2);
		int esperado=4;
	   assertEquals(resultado,esperado);
	   
	   
	   
}
	//Test Area Trapecio.
	@Test
	public void testAreatrapecio() {
		int resultado=Geometria.areatrapecio(2,2,2);
		int esperado=4;
	   assertEquals(resultado,esperado);
	   
	   
	   
}
	//Test Figura.
	@Test
	public void testfigura() {
		String resultado=Geometria.figura(3);
	   String   esperado="Triangulo";
	   assertEquals(resultado,esperado);

	}
}