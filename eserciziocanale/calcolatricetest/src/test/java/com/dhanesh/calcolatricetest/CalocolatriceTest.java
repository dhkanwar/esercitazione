package com.dhanesh.calcolatricetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalocolatriceTest {
	
	
	@Test
	void sommaTest() {
		Calcolatrice calcolatrice=new Calcolatrice();
		assertEquals(calcolatrice.somma(10,20),30);
	}
	
	@Test
	void sottrazioneTest() {
		Calcolatrice calcolatrice=new Calcolatrice();
		assertEquals(calcolatrice.sottrazione(20, 10),10.0);
	}
	
	@Test
	void divisioneTest() {
		Calcolatrice calcolatrice=new Calcolatrice();
		IllegalArgumentException illegalArgumentException =
                assertThrows(IllegalArgumentException.class,
                        () -> calcolatrice.divisione(20,0));
		
	}
	
	@Test
	void potenzaTest() {
		Calcolatrice calcolatrice=new Calcolatrice();
		assertEquals(calcolatrice.potenza(2, 2),4);
	}
	
	@Test
	void mediaTest() {
		Calcolatrice calcolatrice=new Calcolatrice();
		assertEquals(calcolatrice.media(2, 4),3);
	}

}
