package it.profilglass.classmodel;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.profilglass.orm.RichiesteTestata;

@Entity
@Table(name = "conf_anagrafica_bp")
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
	
	@OneToMany(mappedBy="bp", fetch = FetchType.LAZY)
	private List<RichiesteTestata> listaRichieste;
	
	@Column(name="ClienteFornitore")
	private int clienteFornitore;
	
	public BusinessPartner(String businessPartner, String descrizione, Date dataInizioValidita, Date dataFineValidita, int clienteFornitore, List<RichiesteTestata> bp)
	{
		this.businessPartner = businessPartner;
		this.descrizione = descrizione;
		this.dataInizioValidita = dataInizioValidita;
		this.dataFineValidita = dataFineValidita;
		this.clienteFornitore = clienteFornitore;
		this.listaRichieste = bp;
	}
	
	public BusinessPartner(String businessPartner, String descrizione, Date dataInizioValidita, Date dataFineValidita, int clienteFornitore)
	{
		this.businessPartner = businessPartner;
		this.descrizione = descrizione;
		this.dataInizioValidita = dataInizioValidita;
		this.dataFineValidita = dataFineValidita;
		this.clienteFornitore = clienteFornitore;
		this.listaRichieste = null;
	}
	
	public BusinessPartner()
	{
		this.businessPartner = "";
		this.descrizione = "";
		this.dataInizioValidita = new Date(1970,1,1,0,0,1);
		this.dataFineValidita = new Date(2040,12,31,23,59,59);
		this.clienteFornitore = 0;
		this.listaRichieste = null;
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

	public List<RichiesteTestata> getListaRichieste() {
		return listaRichieste;
	}

	public void setListaRichieste(List<RichiesteTestata> listaRichieste) {
		this.listaRichieste = listaRichieste;
	}
}
