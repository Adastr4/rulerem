package it.profilglass.classmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="conf_centro_lavoro")
public class CentroLavoro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCentro")
	private String idCentro;
	
	@Column(name="descrizione")
	private String descrizione;
	
	public CentroLavoro(String idCentro, String descrizione)
	{
		this.idCentro = idCentro;
		this.descrizione = descrizione;
	}
	
	public CentroLavoro()
	{
		this.idCentro = "";
		this.descrizione = "";
	}

	public String getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(String idCentro) {
		this.idCentro = idCentro;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
