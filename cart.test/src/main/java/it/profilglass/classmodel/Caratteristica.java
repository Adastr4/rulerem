package it.profilglass.classmodel;

import java.util.ArrayList;

import test.test.ReadDB;

public class Caratteristica {
	
	private String caratteristicaId;
	private String descrizioneCaratteristica;
	private int caratteristicaOrder;
	private String classe;
	private ArrayList<Opzione> valori;
	private Opzione selectedValue;
	private boolean enabled = false;
	private boolean visible = false;
	
	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String classe, ArrayList<Opzione> valori, Opzione selectedValue)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = valori;
		this.selectedValue = selectedValue;
		this.descrizioneCaratteristica = descrizioneCaratteristica;
	}
	
	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String classe, Opzione selectedValue)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = this.setListOfValues();
		this.selectedValue = selectedValue;
		this.descrizioneCaratteristica = descrizioneCaratteristica;
	}
	
	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String classe)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = this.setListOfValues();
		this.selectedValue = new Opzione("","");
		this.descrizioneCaratteristica = descrizioneCaratteristica;
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
	
	private Opzione deleteElementAt(int index)
	{
		return this.valori.remove(index);
	}
	
	private boolean deleteElementByValue(String value)
	{
		for(Opzione valore : valori)
		{
			if(valore.getOpzione().toString().equalsIgnoreCase(value))
				return this.valori.remove(valore);
		}
		
		return false;
	}
	
	private boolean deleteElementByObject(Opzione opz)
	{
		return this.valori.remove(opz);
	}

	public Opzione getSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(Opzione selectedValue) {
		this.selectedValue = selectedValue;
	}
	
	public void setSelectedValueFromOpzioneList(String value) {
		for(Opzione valore : valori)
		{
			if(valore.getOpzione().toString().equalsIgnoreCase(value))
				this.selectedValue = valore;
		}
	}

	public String getDescrizioneCaratteristica() {
		return descrizioneCaratteristica;
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
