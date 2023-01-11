package com.dhanesh.calcolatricetest;

public class MainCalcolatrice {

	public static void main(String[] args) {
		Calcolatrice cal=new Calcolatrice();
		
		System.out.println("media :"+cal.media(2, 5));
		System.out.println("somma:"+cal.somma(10, 20));
		System.out.println("sottrazione:"+cal.sottrazione(20, 10));
		System.out.println("potenza:"+cal.potenza(2, 2));
		System.out.println("divisione:"+cal.divisione(4, 2));
		
		

	}

}
