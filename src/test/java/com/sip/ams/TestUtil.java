package com.sip.ams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUtil {

	@Test
	void testSomme() {
		assertEquals(Util.somme(10,2),12);
	}
	@Test
	void testProduit() {
		assertEquals(Util.produit(10,2),20);;
	}
	@Test
	void testdifference() {
		assertEquals(Util.difference(10,2),8);;
	}
}
