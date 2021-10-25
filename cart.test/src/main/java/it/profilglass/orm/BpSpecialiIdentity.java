package it.profilglass.orm;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class BpSpecialiIdentity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String codiceArticolo;
	
	@NotNull
	private String businessPartner;
	
	public BpSpecialiIdentity(String codiceArticolo, String businessPartner)
	{
		this.codiceArticolo = codiceArticolo;
		this.businessPartner = businessPartner;
	}
	
	public BpSpecialiIdentity()
	{
		this.codiceArticolo = "";
		this.businessPartner = "";
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public String getBusinessPartner() {
		return businessPartner;
	}

	public void setBusinessPartner(String businessPartner) {
		this.businessPartner = businessPartner;
	}
}
