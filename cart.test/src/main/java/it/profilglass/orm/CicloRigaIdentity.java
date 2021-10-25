package it.profilglass.orm;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class CicloRigaIdentity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	String codiceArticolo;
	
	@NotNull
	int revisione;
	
	@NotNull
	String ciclo;
	
	@NotNull
	int operazione;
	
	public CicloRigaIdentity(String codiceArticolo, int revisione, String ciclo, int operazione)
	{
		this.codiceArticolo = codiceArticolo;
		this.revisione = revisione;
		this.ciclo = ciclo;
		this.operazione = operazione;
	}
	
	public CicloRigaIdentity()
	{
		this.codiceArticolo = "";
		this.revisione = 0;
		this.ciclo = "";
		this.operazione = 0;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public int getRevisione() {
		return revisione;
	}

	public void setRevisione(int revisione) {
		this.revisione = revisione;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public int getOperazione() {
		return operazione;
	}

	public void setOperazione(int operazione) {
		this.operazione = operazione;
	}

}
