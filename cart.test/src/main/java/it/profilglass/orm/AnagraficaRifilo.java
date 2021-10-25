package it.profilglass.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "conf_anagrafica_rifilo")
public class AnagraficaRifilo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AnagraficaRifiloIdentity identity;
	
	@Column(name="Item")
	private String item;
	
	@Column(name="Finitura")
	private String finitura;
	
	@Column(name="StatoFisico")
	private String statoFisico;
	
	@Column(name="SpessoreDa")
	private float spessoreDa;
	
	@Column(name="SpessoreA")
	private float spessoreA;
	
	@Column(name="LarghezzaDa")
	private float larghezzaDa;
	
	@Column(name="LarghezzaA")
	private float larghezzaA;
	
	@Column(name="Rifilo")
	private String rifilo;
	
	@Column(name="FamigliaRifilo")
	private String famigliaRifilo;
	
	public AnagraficaRifilo(AnagraficaRifiloIdentity identity, String item, String finitura, String statoFisico, float spessoreDa, float spessoreA, float larghezzaDa, float larghezzaA, String rifilo, String famigliaRifilo)
	{
		this.identity = identity;
		this.item = item;
		this.finitura = finitura;
		this.statoFisico = statoFisico;
		this.spessoreA = spessoreA;
		this.spessoreDa = spessoreDa;
		this.larghezzaA = larghezzaA;
		this.larghezzaDa = larghezzaDa;
		this.rifilo = rifilo;
		this.famigliaRifilo = famigliaRifilo;
	}
	
	public AnagraficaRifilo()
	{
		this.identity = new AnagraficaRifiloIdentity();
		this.item = "";
		this.finitura = "";
		this.statoFisico = "";
		this.spessoreA = 0;
		this.spessoreDa = 0;
		this.larghezzaA = 0;
		this.larghezzaDa = 0;
		this.rifilo = "";
		this.famigliaRifilo = "";
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getFinitura() {
		return finitura;
	}

	public void setFinitura(String finitura) {
		this.finitura = finitura;
	}

	public String getStatoFisico() {
		return statoFisico;
	}

	public void setStatoFisico(String statoFisico) {
		this.statoFisico = statoFisico;
	}

	public float getSpessoreDa() {
		return spessoreDa;
	}

	public void setSpessoreDa(float spessoreDa) {
		this.spessoreDa = spessoreDa;
	}

	public float getSpessoreA() {
		return spessoreA;
	}

	public void setSpessoreA(float spessoreA) {
		this.spessoreA = spessoreA;
	}

	public float getLarghezzaDa() {
		return larghezzaDa;
	}

	public void setLarghezzaDa(float larghezzaDa) {
		this.larghezzaDa = larghezzaDa;
	}

	public float getLarghezzaA() {
		return larghezzaA;
	}

	public void setLarghezzaA(float larghezzaA) {
		this.larghezzaA = larghezzaA;
	}

	public String getRifilo() {
		return rifilo;
	}

	public void setRifilo(String rifilo) {
		this.rifilo = rifilo;
	}

	public String getFamigliaRifilo() {
		return famigliaRifilo;
	}

	public void setFamigliaRifilo(String famigliaRifilo) {
		this.famigliaRifilo = famigliaRifilo;
	}
}
