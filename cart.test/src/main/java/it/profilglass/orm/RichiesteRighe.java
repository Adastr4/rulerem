package it.profilglass.orm;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import it.profilglass.classmodel.Caratteristica;

@Entity
@Table(name="conf_richieste_righe")
public class RichiesteRighe {
	
	@Id
	@Column(name="IdRichiesta")
	private int idRichieste;
	
	@Column(name="Item")
	private String item;
	
	@Column(name="IdSequenza")
	private int idSequenza;
	
	@Column(name="Caratteristica")
	private String caratteristica;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumns({
		@JoinColumn(name="caratteristica", referencedColumnName = "Caratteristica", insertable = false, updatable = false),
		@JoinColumn(name="item", referencedColumnName = "Item", insertable = false, updatable = false),
	})
	private Caratteristica caratteristicaObj;
	
	@Column(name="Valore")
	private String valore;
	
	@Column(name="Edit")
	private String edit;
	
	public RichiesteRighe(int idRichieste, String item, int idSequenza, String caratteristica, Caratteristica caratteristicaObj, String valore, String edit)
	{
		this.idRichieste = idRichieste;
		this.item = item;
		this.idSequenza = idSequenza;
		this.caratteristica = caratteristica;
		this.caratteristicaObj = caratteristicaObj;
		this.valore = valore;
		this.edit = edit;
	}
	
	public RichiesteRighe()
	{
		this.idRichieste = 0;
		this.item = "";
		this.idSequenza = 0;
		this.caratteristica = "";
		this.caratteristicaObj = null;
		this.valore = "";
		this.edit = "";
	}

	public int getIdRichieste() {
		return idRichieste;
	}

	public void setIdRichieste(int idRichieste) {
		this.idRichieste = idRichieste;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getIdSequenza() {
		return idSequenza;
	}

	public void setIdSequenza(int idSequenza) {
		this.idSequenza = idSequenza;
	}

	public String getCaratteristica() {
		return caratteristica;
	}

	public void setCaratteristica(String caratteristica) {
		this.caratteristica = caratteristica;
	}

	public Caratteristica getCaratteristicaObj() {
		return caratteristicaObj;
	}

	public void setCaratteristicaObj(Caratteristica caratteristicaObj) {
		this.caratteristicaObj = caratteristicaObj;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public String getEdit() {
		return edit;
	}

	public void setEdit(String edit) {
		this.edit = edit;
	}
}
