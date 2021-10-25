package it.profilglass.orm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "conf_anagrafica_articolo")
public class AnagraficaArticolo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private AnagraficaArticoloIdentity identity;
	
	@Column(name="CodiceArticolo")
	private String codiceArticolo;
	
	@Column(name="Revisione")
	private int revisione;
	
	@Column(name="Descrizione")
	private String descrizione;
	
	@Column(name="TipoArticolo")
	private int tipoArticolo;
	
	@Column(name="GruppoArticolo")
	private String gruppoArticolo;
	
	@Column(name="TipoProdotto")
	private String tipoProdotto;
	
	@Column(name="ClasseProdotto")
	private String classeProdotto;
	
	@Column(name="Materiale")
	private String materiale;
	
	@Column(name="Dimensione")
	private String dimensione;
	
	@Column(name="Standard")
	private String standard;
	
	@Column(name="DataCreazione")
	private Date dataCreazione;
	
	@Column(name="UtenteCreazione")
	private String utenteCreazione;
	
	@Column(name="DataRevisione")
	private Date dataRevisione;
	
	@Column(name="UtenteRevisione")
	private String utenteRevisione;
	
	@Column(name="NotaRevisione")
	private String notaRevisione;
	
	@Column(name="DataInvio")
	private Date dataInvio;
	
	@Column(name="DescLin1")
	private String descLin1;
	
	@Column(name="DescLin2")
	private String descLin2;
	
	@Column(name="DescLin3")
	private String descLin3;
	
	@Column(name="DescLin4")
	private String descLin4;
	
	@Column(name="DescLin5")
	private String descLin5;
	
	@Column(name="DescLin6")
	private String descLin6;
	
	@Column(name="DescLin7")
	private String descLin7;
	
	@Column(name="DescLin8")
	private String descLin8;
	
	@Column(name="DescLin9")
	private String descLin9;
	
	@Column(name="DescLin10")
	private String descLin10;
	
	@Column(name="Nota")
	private String nota;
	
	public AnagraficaArticolo(AnagraficaArticoloIdentity identity, String codiceArticolo, int revisione, String descrizione, int tipoArticolo, String gruppoArticolo, String tipoProdotto, String classeProdotto, String materiale, String dimensione, String standard, Date dataCreazione, String utenteCreazione, Date dataRevisione, String utenteRevisione, String notaRevisione, Date dataInvio, String descLin1, String descLin2, String descLin3, String descLin4, String descLin5, String descLin6, String descLin7, String descLin8, String descLin9, String descLin10, String nota)
	{
		this.identity = identity;
		this.codiceArticolo = codiceArticolo;
		this.revisione = revisione;
		this.descrizione = descrizione;
		this.tipoArticolo = tipoArticolo;
		this.gruppoArticolo = gruppoArticolo;
		this.tipoProdotto = tipoProdotto;
		this.classeProdotto = classeProdotto;
		this.materiale = materiale;
		this.dimensione =  dimensione;
		this.standard = standard;
		this.dataCreazione = dataCreazione;
		this.utenteCreazione = utenteCreazione;
		this.dataRevisione = dataRevisione;
		this.utenteRevisione = utenteRevisione;
		this.notaRevisione = notaRevisione;
		this.dataInvio = dataInvio;
		this.descLin1 = descLin1;
		this.descLin2 = descLin2;
		this.descLin3 = descLin3;
		this.descLin4 = descLin4;
		this.descLin5 = descLin5;
		this.descLin6 = descLin6;
		this.descLin7 = descLin7;
		this.descLin8 = descLin8;
		this.descLin9 = descLin9;
		this.descLin10 = descLin10;
		this.nota = nota;
	}
	
	public AnagraficaArticolo()
	{
		this.identity = new AnagraficaArticoloIdentity();
		this.codiceArticolo = "";
		this.revisione = 0;
		this.descrizione = "";
		this.tipoArticolo = 0;
		this.gruppoArticolo = "";
		this.tipoProdotto = "";
		this.classeProdotto = "";
		this.materiale = "";
		this.dimensione = "";
		this.standard = "";
		this.dataCreazione = new Date(1970,1,1,0,0,1);
		this.utenteCreazione = "";
		this.dataRevisione = new Date(1970,1,1,0,0,1);;
		this.utenteRevisione = "";
		this.notaRevisione = "";
		this.dataInvio = new Date(1970,1,1,0,0,1);;
		this.descLin1 = "";
		this.descLin2 = "";
		this.descLin3 = "";
		this.descLin4 = "";
		this.descLin5 = "";
		this.descLin6 = "";
		this.descLin7 = "";
		this.descLin8 = "";
		this.descLin9 = "";
		this.descLin10 = "";
		this.nota = "";
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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getTipoArticolo() {
		return tipoArticolo;
	}

	public void setTipoArticolo(int tipoArticolo) {
		this.tipoArticolo = tipoArticolo;
	}

	public String getGruppoArticolo() {
		return gruppoArticolo;
	}

	public void setGruppoArticolo(String gruppoArticolo) {
		this.gruppoArticolo = gruppoArticolo;
	}

	public String getTipoProdotto() {
		return tipoProdotto;
	}

	public void setTipoProdotto(String tipoProdotto) {
		this.tipoProdotto = tipoProdotto;
	}

	public String getClasseProdotto() {
		return classeProdotto;
	}

	public void setClasseProdotto(String classeProdotto) {
		this.classeProdotto = classeProdotto;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public String getDimensione() {
		return dimensione;
	}

	public void setDimensione(String dimensione) {
		this.dimensione = dimensione;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public String getUtenteCreazione() {
		return utenteCreazione;
	}

	public void setUtenteCreazione(String utenteCreazione) {
		this.utenteCreazione = utenteCreazione;
	}

	public Date getDataRevisione() {
		return dataRevisione;
	}

	public void setDataRevisione(Date dataRevisione) {
		this.dataRevisione = dataRevisione;
	}

	public String getUtenteRevisione() {
		return utenteRevisione;
	}

	public void setUtenteRevisione(String utenteRevisione) {
		this.utenteRevisione = utenteRevisione;
	}

	public String getNotaRevisione() {
		return notaRevisione;
	}

	public void setNotaRevisione(String notaRevisione) {
		this.notaRevisione = notaRevisione;
	}

	public Date getDataInvio() {
		return dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	public String getDescLin1() {
		return descLin1;
	}

	public void setDescLin1(String descLin1) {
		this.descLin1 = descLin1;
	}

	public String getDescLin2() {
		return descLin2;
	}

	public void setDescLin2(String descLin2) {
		this.descLin2 = descLin2;
	}

	public String getDescLin3() {
		return descLin3;
	}

	public void setDescLin3(String descLin3) {
		this.descLin3 = descLin3;
	}

	public String getDescLin4() {
		return descLin4;
	}

	public void setDescLin4(String descLin4) {
		this.descLin4 = descLin4;
	}

	public String getDescLin5() {
		return descLin5;
	}

	public void setDescLin5(String descLin5) {
		this.descLin5 = descLin5;
	}

	public String getDescLin6() {
		return descLin6;
	}

	public void setDescLin6(String descLin6) {
		this.descLin6 = descLin6;
	}

	public String getDescLin7() {
		return descLin7;
	}

	public void setDescLin7(String descLin7) {
		this.descLin7 = descLin7;
	}

	public String getDescLin8() {
		return descLin8;
	}

	public void setDescLin8(String descLin8) {
		this.descLin8 = descLin8;
	}

	public String getDescLin9() {
		return descLin9;
	}

	public void setDescLin9(String descLin9) {
		this.descLin9 = descLin9;
	}

	public String getDescLin10() {
		return descLin10;
	}

	public void setDescLin10(String descLin10) {
		this.descLin10 = descLin10;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public AnagraficaArticoloIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(AnagraficaArticoloIdentity identity) {
		this.identity = identity;
	}
}
