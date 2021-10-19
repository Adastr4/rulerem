package it.profilglass.classmodel;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "conf_caratteristica_opzioni")
public class Opzione implements Comparable<Opzione>{
	@EmbeddedId
	private OpzioneIdentity opzIdentity;
	
	@Column(name="Opzione")
	private String opzione;
	
	@Column(name="Descrizione")
	private String descrizione;
	
	@Column(name="Item")
	private String item;
	
	@Column(name="Caratteristica")
	private String caratteristica;
	
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

	@Override
	public int compareTo(Opzione o) {
		    if (getOpzione() == null || o.getOpzione() == null) {
		      return 0;
		    }
		    return getOpzione().compareTo(o.getOpzione());
	}
	
	
}
