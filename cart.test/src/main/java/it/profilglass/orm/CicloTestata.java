package it.profilglass.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "conf_ciclo_testata")
public class CicloTestata implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CicloTestataIdentity identity;
	
	@Column(name="Descrizione")
	private String descrizione;
	
	@Column(name="Ciclo_Std")
	private String ciclo_Std;
	
	@Column(name="Predefinito")
	private int predefinito;
	
	@Column(name="UnitaCiclo")
	private int unitaCiclo;
		
	public CicloTestata(CicloTestataIdentity identity, String descrizione, String ciclo_Std, int predefinito, int unitaCiclo)
	{
		this.identity = identity;
		this.descrizione = descrizione;
		this.ciclo_Std = ciclo_Std;
		this.predefinito = predefinito;
		this.unitaCiclo = unitaCiclo;
	}
	
	public CicloTestata(String codiceArticolo, int revisione, String ciclo, String descrizione, String ciclo_Std, int predefinito, int unitaCiclo)
	{
		this.identity = new CicloTestataIdentity(codiceArticolo,revisione,ciclo);
		this.descrizione = descrizione;
		this.ciclo_Std = ciclo_Std;
		this.predefinito = predefinito;
		this.unitaCiclo = unitaCiclo;
	}

	public CicloTestataIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(CicloTestataIdentity identity) {
		this.identity = identity;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCiclo_Std() {
		return ciclo_Std;
	}

	public void setCiclo_Std(String ciclo_Std) {
		this.ciclo_Std = ciclo_Std;
	}

	public int getPredefinito() {
		return predefinito;
	}

	public void setPredefinito(int predefinito) {
		this.predefinito = predefinito;
	}

	public int getUnitaCiclo() {
		return unitaCiclo;
	}

	public void setUnitaCiclo(int unitaCiclo) {
		this.unitaCiclo = unitaCiclo;
	}
}
