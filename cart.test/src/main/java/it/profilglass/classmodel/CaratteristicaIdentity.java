package it.profilglass.classmodel;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class CaratteristicaIdentity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String caratteristica;
	
	@NotNull
	private String item;
	
	@NotNull
	private int sequenza;
	
	public CaratteristicaIdentity()
	{
		this.caratteristica = "";
		this.item = "";
		this.sequenza = 0;
	}
	
	public CaratteristicaIdentity(String caratteristica, String item, int sequenza)
	{
		this.caratteristica = caratteristica;
		this.item = item;
		this.sequenza = sequenza;
	}

	public String getCaratteristica() {
		return caratteristica;
	}

	public void setCaratteristica(String caratteristica) {
		this.caratteristica = caratteristica;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getSequenza() {
		return sequenza;
	}

	public void setSequenza(int sequenza) {
		this.sequenza = sequenza;
	}
}
