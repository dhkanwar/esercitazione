package com.dhanesh.eserciziofinalecalendario;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

	Evento evento=new Evento();
	private String calNome;
	private String calDescrizione;
    private List<Evento> lista=new ArrayList()  ;
    
    

	//per add evento sul calendario
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String getCalNome() {
		return calNome;
	}

	public void setCalNome(String calNome) {
		this.calNome = calNome;
	}

	public String getCalDescrizione() {
		return calDescrizione;
	}

	public void setCalDescrizione(String calDescrizione) {
		this.calDescrizione = calDescrizione;
	}

	public List<Evento> getLista() {
		return lista;
	}

	public void setLista(List<Evento> lista) {
		this.lista = lista;
	}

	public void addEvent(Evento e1) {
		lista.add(evento);
	}
		
	public Calendario(Evento evento, String calNome, String calDescrizione, List<Evento> lista) {
		super();
		this.evento = evento;
		this.calNome = calNome;
		this.calDescrizione = calDescrizione;
		this.lista = lista;
	}

	public Calendario() {
		super();
		// TODO Auto-generated constructor stub
	}

	//per remouvere evento del calendario
	public void removeEvent(Evento e) {
		for(int i=0;i<lista.size();i++) {
			if(e==lista.get(i)) {
				lista.remove(i);
			}
		}
	}
		
		public void viewCal() {
			System.out.println(lista);
		}
	
}
