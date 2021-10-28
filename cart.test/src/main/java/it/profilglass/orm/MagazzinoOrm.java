package it.profilglass.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conf_magazzino")
public class MagazzinoOrm {
	
	@Id
	@Column(name="Magazzino")
	private String magazzino;
	
	@Column(name="Descrizione")
	private String descrizione;
	
	@Column(name="Visualizza")
	private int visualizza;
	
	public MagazzinoOrm(String magazzino, String descrizione, int visualizza)
	{
		this.magazzino = magazzino;
		this.descrizione = descrizione;
		this.visualizza = visualizza;
	}
	
	public MagazzinoOrm()
	{
		this.magazzino = "";
		this.descrizione = "";
		this.visualizza = 0;
	}

	public String getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(String magazzino) {
		this.magazzino = magazzino;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getVisualizza() {
		return visualizza;
	}

	public void setVisualizza(int visualizza) {
		this.visualizza = visualizza;
	}
}
