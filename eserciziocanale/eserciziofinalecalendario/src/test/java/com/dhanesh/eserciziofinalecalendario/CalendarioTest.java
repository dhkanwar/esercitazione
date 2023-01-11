package com.dhanesh.eserciziofinalecalendario;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class CalendarioTest {

	@Test
	void calAddTest() {
		Calendario cal=new Calendario();
		Evento e=new Evento();
		assertNotNull(cal.addEvent(e));
	}
	@Test
	void calRemoveTest() {
		Calendario cal=new Calendario();
		Evento e=new Evento();
		assertNotNull(cal.removeEvent(e));
	}

	
}
