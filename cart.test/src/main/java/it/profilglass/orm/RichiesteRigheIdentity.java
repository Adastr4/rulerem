package it.profilglass.orm;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class RichiesteRigheIdentity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private int idRichiesta;
	
	@NotNull
	private String item;
	
	@NotNull
	private int idSequenza;
	
	@NotNull
	private String caratteristica;
	
	public RichiesteRigheIdentity(int idRichiesta, String item, int idSequenza, String caratteristica)
	{
		this.idRichiesta = idRichiesta;
		this.item = item;
		this.idSequenza = idSequenza;
		this.caratteristica = caratteristica;
	}
	
	public RichiesteRigheIdentity()
	{
		this.idRichiesta = 0;
		this.item = "";
		this.idSequenza = 0;
		this.caratteristica = "";
	}

	public int getIdRichiesta() {
		return idRichiesta;
	}

	public void setIdRichieste(int idRichiesta) {
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
}
