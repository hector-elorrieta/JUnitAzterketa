package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modelo.LibZerrenda;
import modelo.Liburua;

class LibZerrendaTest {

	public static LibZerrenda lib0;
	public static LibZerrenda lib1;
	public static LibZerrenda lib2;
	public static Liburua liburua;
	public static Liburua liburua2;
	public static Liburua liburua3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		lib0 = new LibZerrenda();
		liburua = new Liburua("las aventuras del Mago", "6767", "hector");
		liburua2 = new Liburua("Manin", "8989", "Rajoy");
		liburua3 = new Liburua("Panadero", "2323", "Tadeo");
		lib1 = new LibZerrenda();
		lib1.gehitu(liburua);
		lib1.gehitu(liburua2);
		lib2 = new LibZerrenda();
		lib2.gehitu(liburua);
		lib2.gehitu(liburua2);
		lib2.gehitu(liburua3);
		
	}
	
	
	@Test
	void beteta1() {
		assertTrue(lib2.beteta());
	}
	
	@Test
	void beteta2() {
		assertFalse(lib1.beteta());
	}
	
	@Test
	void ezabatu1() {
		assertTrue(lib1.ezabatu("6767"));
	}
	
	@Test
	void ezabatu2() {
		assertFalse(lib0.ezabatu("687464564"));
	}

	@Test
	void bilatutit1() {
		assertEquals(lib2.bilatutit("Panadero"), 2);
	}
	
	@Test
	void bilatutit2() {
		assertEquals(lib2.bilatutit("Xabititero"), -1);
	}
	
	@Test
	void bilatuisbn() {
		assertEquals(lib2.bilatuisbn("2323"), 2);
	}
	
	@Test
	void eskuratu1() {
		assertEquals(lib2.eskuratu(2), liburua3);
	}
	
	@Test
	void eskuratu2() {
		Liburua per = null;
		assertEquals(lib0.eskuratu(2), per);
	}
	
	@Test
	void lzerrendaEskuratu() {
		assertEquals(lib2.lzerrendaEskuratu(), "Liburua [izenburua=las aventuras del Mago, isbn=6767, idazlea=hector]Liburua [izenburua=Manin, isbn=8989, idazlea=Rajoy]Liburua [izenburua=Panadero, isbn=2323, idazlea=Tadeo]");
	}
}
