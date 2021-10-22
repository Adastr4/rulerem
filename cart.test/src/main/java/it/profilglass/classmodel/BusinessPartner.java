package it.profilglass.classmodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class BusinessPartner {
	@Id
	@Column(name="businessPartner")
	private String businessPartner;
	
	@Column(name="Descrizione")
	private String descrizione;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DataInizioValidita")
	private Date dataInizioValidita;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DataFineValidita")
	private Date dataFineValidita;
	
	@Column(name="ClienteFornitore")
	private int clienteFornitore;
	
	public BusinessPartner(String businessPartner, String descrizione, Date dataInizioValidita, Date dataFineValidita, int clienteFornitore)
	{
		this.businessPartner = businessPartner;
		this.descrizione = descrizione;
		this.dataInizioValidita = dataInizioValidita;
		this.dataFineValidita = dataFineValidita;
		this.clienteFornitore = clienteFornitore;
	}
	
	public BusinessPartner()
	{
		this.businessPartner = "";
		this.descrizione = "";
		this.dataInizioValidita = new Date(1970,1,1,0,0,1);
		this.dataFineValidita = new Date(2040,12,31,23,59,59);
		this.clienteFornitore = 0;
	}

	public String getBusinessPartner() {
		return businessPartner;
	}

	public void setBusinessPartner(String businessPartner) {
		this.businessPartner = businessPartner;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}

	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	public int getClienteFornitore() {
		return clienteFornitore;
	}

	public void setClienteFornitore(int clienteFornitore) {
		this.clienteFornitore = clienteFornitore;
	}
}
