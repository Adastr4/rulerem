package it.profilglass.orm;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
public class RichiesteRighe implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RichiesteRigheIdentity identity;
	
	@Column(name="IdRichiesta", insertable=false, updatable=false)
	private int idRichiesta;
	
	@Column(name="Item", insertable=false, updatable=false)
	private String item;
	
	@Column(name="idSequenza", insertable=false, updatable=false)
	private int idSequenza;
	
	@Column(name="Caratteristica", insertable=false, updatable=false)
	private String caratteristica;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumns({
		@JoinColumn(name="caratteristica", referencedColumnName = "Caratteristica", insertable = false, updatable = false),
		@JoinColumn(name="item", referencedColumnName = "Item", insertable = false, updatable = false),
	})
	private Caratteristica caratteristicaObj2;
	
	@Column(name="Valore")
	private String valore;
	
	@Column(name="Edit")
	private String edit;
	
	public RichiesteRighe(RichiesteRigheIdentity identity, int idRichieste, String item, int idSequenza, String caratteristica, Caratteristica caratteristicaObj, String valore, String edit)
	{
		this.idRichiesta = idRichieste;
		this.item = item;
		this.idSequenza = idSequenza;
		this.caratteristica = caratteristica;
		this.caratteristicaObj2 = caratteristicaObj;
		this.valore = valore;
		this.edit = edit;
		this.identity = identity;
	}
	
	public RichiesteRighe()
	{
		this.idRichiesta = 0;
		this.item = "";
		this.idSequenza = 0;
		this.caratteristica = "";
		this.caratteristicaObj2 = null;
		this.valore = "";
		this.edit = "";
		this.identity = null;
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
		return caratteristicaObj2;
	}

	public void setCaratteristicaObj(Caratteristica caratteristicaObj) {
		this.caratteristicaObj2 = caratteristicaObj;
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

	public RichiesteRigheIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(RichiesteRigheIdentity identity) {
		this.identity = identity;
	}

	public Caratteristica getCaratteristicaObj2() {
		return caratteristicaObj2;
	}

	public void setCaratteristicaObj2(Caratteristica caratteristicaObj2) {
		this.caratteristicaObj2 = caratteristicaObj2;
	}
	
}
