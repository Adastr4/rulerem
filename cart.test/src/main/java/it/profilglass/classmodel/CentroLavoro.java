package it.profilglass.classmodel;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="conf_centro_lavoro")
public class CentroLavoro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCentro")
	private String idCentro;
	
	@OneToMany(mappedBy="idCentroLavoro", fetch = FetchType.LAZY)
	private List<Macchina> macchine;

	@Column(name="descrizione")
	private String descrizione;
	
	public CentroLavoro(String idCentro, String descrizione, List<Macchina> macchine)
	{
		this.idCentro = idCentro;
		this.descrizione = descrizione;
		this.macchine = macchine;
	}
	
	public CentroLavoro(String idCentro, String descrizione)
	{
		this.idCentro = idCentro;
		this.descrizione = descrizione;
		this.macchine = null;
	}
	
	public CentroLavoro()
	{
		this.idCentro = "";
		this.descrizione = "";
		this.macchine = null;
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
	
	public List<Macchina> getMacchine() {
		return macchine;
	}

	public void setMacchine(List<Macchina> macchine) {
		this.macchine = macchine;
	}
}
