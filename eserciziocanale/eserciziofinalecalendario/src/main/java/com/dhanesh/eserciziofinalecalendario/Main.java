package com.dhanesh.eserciziofinalecalendario;

import java.util.Scanner;

import org.apache.log4j.Logger;


public class Main {
  
	final static Logger logger = Logger.getLogger(Main.class);
	public static void main(String[] args) {
		
		Evento evento=new Evento();
		Calendario cal=new Calendario();
		System.out.println("INSERISCI CAL NOME");
		cal.setCalNome(evento.getNome());
		System.out.println("INSERISCI CAL DESCRIZIONE");
		cal.setCalNome(evento.getDescrizione());
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("INSERISCI NOME EVENTO");
        evento.setNome(scanner.next());
		System.out.println("INSERISCI DESCRIZIONE");
		evento.setDescrizione(scanner.next());
		System.out.println("INSERISCI GIORNO");
		evento.setGiorno(scanner.nextInt());
		System.out.println("INSERISCI MESE");
		evento.setMese(scanner.nextInt());
		System.out.println("INSERISCI ANNO");
		evento.setAnno(scanner.nextInt());
		
		logger.info("avvio successo"+scanner);
		logger.info("successo");
	}
	

}
