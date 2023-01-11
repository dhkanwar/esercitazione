package com.dhanesh.calcolatricetest;

public class Calcolatrice {
	
	public int somma(int numero1,int numero2) {
		return numero1+numero2;
	}
	
	public double sottrazione(int numero1,int numero2) {
		return numero1-numero2;
	}
	
	public double divisione(int numero1,int numero2) {
		if(numero2==0) {
			throw new IllegalArgumentException ("Argument not valid");
		}else {
		return numero1/numero2;}
	}
	
	public int potenza(int numero1,int numero2) {
		int pow=1;
		for(int i=1;i<=numero2;i++) {
			pow=numero1*pow;
		}
		return pow;
	}

	public double media(double numero1 ,double numero2) {
		return (numero1+numero2)/2;
	}
}
