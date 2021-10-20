package it.profilglass.classmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "conf_caratteristica_opzioni")
public class Opzione implements Comparable<Opzione>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OpzioneIdentity opzIdentity;
	
	@Column(name="Opzione")
	private String opzione;
	
	@Column(name="Descrizione")
	private String descrizione;
	
	@Column(name="Item")
	private String item;
	
	@Column(name="caratteristica")
	private String caratteristica;
	
	private int annulla;
	
	@Column(name="Desc_lin1")
	private String descLin1;
	
	@Column(name="Desc_lin2")
	private String descLin2;
	
	@Column(name="Desc_lin3")
	private String descLin3;
	
	@Column(name="Desc_lin4")
	private String descLin4;
	
	@Column(name="Desc_lin5")
	private String descLin5;
	
	@Column(name="Desc_lin6")
	private String descLin6;
	
	@Column(name="Desc_lin7")
	private String descLin7;
	
	@Column(name="Desc_lin8")
	private String descLin8;
	
	@Column(name="Desc_lin9")
	private String descLin9;
	
	@Column(name="Desc_lin10")
	private String descLin10;
	
	public Opzione(OpzioneIdentity opzId, String opzione, String caratteristica, String item, String descrizione, String descLin1, String descLin2, String descLin3, String descLin4, String descLin5, String descLin6, String descLin7, String descLin8, String descLin9, String descLin10, int annulla)
	{
		this.opzIdentity = opzId;
		this.opzione = opzione;
		this.descrizione = descrizione;
		this.item = item;
		this.caratteristica = caratteristica;
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
		this.annulla = annulla;
	}
	
	public Opzione(String opzione, String descrizione)
	{
		this.opzIdentity = null;
		this.opzione = opzione;
		this.descrizione = descrizione;
		this.item = "";
		this.caratteristica = "";
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
		this.annulla = 0;
	}
	
	public Opzione(String opzione)
	{
		this.opzIdentity = null;
		this.opzione = opzione;
		this.descrizione = "";
		this.item = "";
		this.caratteristica = "";
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
		this.annulla = 0;
	}
	
	public Opzione()
	{
		this.opzIdentity = null;
		this.opzione = "";
		this.descrizione = "";
		this.item = "";
		this.caratteristica = "";
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
		this.annulla = 0;
	}

	public String getOpzione() {
		return opzione;
	}
	
	public int getOpzioneToInt() {
		return Integer.parseInt(opzione);
	}

	public void setOpzione(String opzione) {
		this.opzione = opzione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public OpzioneIdentity getOpzIdentity() {
		return opzIdentity;
	}

	public void setOpzIdentity(OpzioneIdentity opzIdentity) {
		this.opzIdentity = opzIdentity;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCaratteristica() {
		return caratteristica;
	}

	public void setCaratteristica(String caratteristica) {
		this.caratteristica = caratteristica;
	}
	
	public int getAnnulla() {
		return annulla;
	}

	public void setAnnulla(int annulla) {
		this.annulla = annulla;
	}

	public String getDesc_Lin1() {
		return descLin1;
	}

	public void setDesc_Lin1(String descLin1) {
		this.descLin1 = descLin1;
	}

	public String getDesc_Lin2() {
		return descLin2;
	}

	public void setDesc_Lin2(String descLin2) {
		this.descLin2 = descLin2;
	}

	public String getDesc_Lin3() {
		return descLin3;
	}

	public void setDesc_Lin3(String descLin3) {
		this.descLin3 = descLin3;
	}

	public String getDesc_Lin4() {
		return descLin4;
	}

	public void setDesc_Lin4(String descLin4) {
		this.descLin4 = descLin4;
	}

	public String getDesc_Lin5() {
		return descLin5;
	}

	public void setDesc_Lin5(String descLin5) {
		this.descLin5 = descLin5;
	}

	public String getDesc_Lin6() {
		return descLin6;
	}

	public void setDesc_Lin6(String descLin6) {
		this.descLin6 = descLin6;
	}

	public String getDesc_Lin7() {
		return descLin7;
	}

	public void setDesc_Lin7(String descLin7) {
		this.descLin7 = descLin7;
	}

	public String getDesc_Lin8() {
		return descLin8;
	}

	public void setDesc_Lin8(String descLin8) {
		this.descLin8 = descLin8;
	}

	public String getDesc_Lin9() {
		return descLin9;
	}

	public void setDesc_Lin9(String descLin9) {
		this.descLin9 = descLin9;
	}

	public String getDesc_Lin10() {
		return descLin10;
	}

	public void setDesc_Lin10(String descLin10) {
		this.descLin10 = descLin10;
	}

	@Override
	public int compareTo(Opzione o) {
		    if (getOpzione() == null || o.getOpzione() == null) {
		      return 0;
		    }
		    return getOpzione().compareTo(o.getOpzione());
	}
	
	
}
