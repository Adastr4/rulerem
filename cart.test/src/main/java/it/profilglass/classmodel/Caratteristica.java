package it.profilglass.classmodel;

import java.util.ArrayList;

import test.test.ReadDB;

public class Caratteristica {
	
	private String caratteristicaId;
	private int caratteristicaOrder;
	private String classe;
	private ArrayList<Opzione> valori;
	private String selectedValue;
	private boolean enabled = false;
	private boolean visible = false;
	
	public Caratteristica(String caratteristicaId, int caratteristicaOrder, String classe, ArrayList<Opzione> valori, String selectedValue)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = valori;
		this.selectedValue = selectedValue;
	}
	
	public Caratteristica(String caratteristicaId, int caratteristicaOrder, String classe, String selectedValue)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = this.setListOfValues();
		this.selectedValue = selectedValue;
	}
	
	public Caratteristica(String caratteristicaId, int caratteristicaOrder, String classe)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = this.setListOfValues();
		this.selectedValue = "";
	}

	public int getCaratteristicaOrder() {
		return caratteristicaOrder;
	}

	public void setCaratteristicaOrder(int caratteristicaOrder) {
		this.caratteristicaOrder = caratteristicaOrder;
	}

	public ArrayList<Opzione> getValori() {
		return valori;
	}

	public void setValori(ArrayList<Opzione> valori) {
		this.valori = valori;
	}

	public String getCaratteristicaId() {
		return caratteristicaId;
	}

	public String getClasse() {
		return classe;
	}
	
	private ArrayList<Opzione> setListOfValues()
	{
		return ReadDB.getOpzioniList(this.classe, this.caratteristicaId);
	}

	public String getSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(String selectedValue) {
		this.selectedValue = selectedValue;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	
}
