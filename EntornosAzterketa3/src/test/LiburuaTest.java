package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modelo.LibZerrenda;
import modelo.Liburua;

class LiburuaTest {

	public static Liburua lib1;
	public static Liburua lib2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		lib1 = new Liburua();
		lib2 = new Liburua("las aventuras del Mago", "6767", "hector");
	}

	@Test
	void Liburua1test() {
		Liburua lib3 = new Liburua();
		assertEquals(lib1, lib3);
	}
	
	@Test
	void Liburua2test() {
		Liburua lib3 = new Liburua("las aventuras del Mago", "6767", "hector");
		assertEquals(lib2, lib3);
	}

	
	@Test
	void setizenburuatest() {
		lib2.setizenburua("Rape");
		assertEquals(lib2.getizenburua(), "Rape");
	}
	
	@Test
	void getisbntest() {
		assertEquals(lib2.getisbn(), "6767");
	}
	
	@Test
	void setisbntest() {
		lib2.setisbn("7896");
		assertEquals(lib2.getisbn(), "7896");
	}
	
	
	@Test
	void setidazleatest() {
		lib2.setidazlea("Rajoy");
		assertEquals(lib2.getidazlea(), "Rajoy");
	}
	
	@Test
	void toStringtest() {
		assertEquals("Liburua [izenburua=Rape, isbn=6767, idazlea=hector]", lib2.toString());
	}
	
	@Test
	void equals() {
		LibZerrenda libz = new LibZerrenda();
		assertFalse(lib2.equals(libz));
	}
}
