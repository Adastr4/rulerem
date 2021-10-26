package it.profilglass.orm;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.profilglass.classmodel.BusinessPartner;

@Entity
@Table(name="conf_richieste_testata")
public class RichiesteTestata {
	@Id
	@Column(name="IdRichiesta")
	private int idRichiesta;
	
	@Column(name="Item")
	private String item;
	
	@Column(name="Descrizione")
	private String descrizione;
	
	@Column(name="BusinessPartner")
	private String businessPartner;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="businessPartner", referencedColumnName = "BusinessPartner", insertable = false, updatable = false)
	private BusinessPartner bp;
	
	@Column(name="Utente")
	private String utente;
	
	@Column(name="Stato")
	private int stato;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DataCreazione")
	private Date dataCreazione;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DataModifica")
	private Date dataModifica;
	
	@Column(name="CodiceArticolo")
	private String codiceArticolo;
	
	@Column(name="Hash")
	private String hash;
	
	@Column(name="Nota")
	private String nota;
	
	public RichiesteTestata(int idRichiesta, String item, String descrizione, String businessPartner,
			BusinessPartner bp, String utente, int stato, Date dataCreazione, Date dataModifica,
			String codiceArticolo, String hash, String nota) {
		this.idRichiesta = idRichiesta;
		this.item = item;
		this.descrizione = descrizione;
		this.businessPartner = businessPartner;
		this.bp = bp;
		this.utente = utente;
		this.stato = stato;
		this.dataCreazione = dataCreazione;
		this.dataModifica = dataModifica;
		this.codiceArticolo = codiceArticolo;
		this.hash = hash;
		this.nota = nota;
	}
	
	public RichiesteTestata() {
		this.idRichiesta = 0;
		this.item = "";
		this.descrizione = "";
		this.businessPartner = "";
		this.bp = null;
		this.utente = "";
		this.stato = 0;
		this.dataCreazione = new Date(1970,1,1,0,0,0);;
		this.dataModifica = new Date(2039,12,31,23,59,59);
		this.codiceArticolo = codiceArticolo;
		this.hash = hash;
		this.nota = nota;
	}

	public int getIdRichiesta() {
		return idRichiesta;
	}

	public void setIdRichiesta(int idRichiesta) {
		this.idRichiesta = idRichiesta;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getBusinessPartner() {
		return businessPartner;
	}

	public void setBusinessPartner(String businessPartner) {
		this.businessPartner = businessPartner;
	}

	public BusinessPartner getBp() {
		return bp;
	}

	public void setBp(BusinessPartner bp) {
		this.bp = bp;
	}

	public String getUtente() {
		return utente;
	}

	public void setUtente(String utente) {
		this.utente = utente;
	}

	public int getStato() {
		return stato;
	}

	public void setStato(int stato) {
		this.stato = stato;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Date getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	
	public int getMaxId()
	{
		return DataManagement.getRichiesteTestataMaxId();
	}
	
	public boolean saveTestata() {
		this.setIdRichiesta(DataManagement.getRichiesteTestataMaxId());
		return DataManagement.createRichiesteTestataObject(this);
	}
}
