package it.profilglass.classmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import test.test.ReadDB;

public class Caratteristica implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CaratteristicaIdentity caraIdentity;
	
	@Column(name="caratteristica")
	private String caratteristicaId;
	
	@Column(name="Descrizione")
	private String descrizioneCaratteristica;
	
	@Column(name="Sequenza")
	private int caratteristicaOrder;
	
	@Column(name="Item")
	private String item;
	
	private ArrayList<Opzione> valori;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DataInizioValidita")
	private Date dataInizioValidita;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DataFineValidita")
	private Date dataFineValidita;
	
	
	private Opzione selectedValue;
	private boolean enabled = false;
	private boolean visible = false;
	
	public Caratteristica(CaratteristicaIdentity caraIdentity, String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String item, ArrayList<Opzione> valori, Opzione selectedValue, Date dataInizioValidita, Date dataFineValidita)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.item = item;
		this.valori = valori;
		this.selectedValue = selectedValue;
		this.descrizioneCaratteristica = descrizioneCaratteristica;
		this.caraIdentity = caraIdentity;
		this.dataInizioValidita = dataInizioValidita;
		this.dataFineValidita = dataFineValidita;
	}
	
	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String item, ArrayList<Opzione> valori, Opzione selectedValue)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.item = item;
		this.valori = valori;
		this.selectedValue = selectedValue;
		this.descrizioneCaratteristica = descrizioneCaratteristica;
		this.caraIdentity = new CaratteristicaIdentity(caratteristicaId, item, caratteristicaOrder);
		this.dataInizioValidita = new Date(1970,1,1,0,0,0);
		this.dataFineValidita = new Date(2039,12,31,23,59,59);
	}
	
	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String item, Opzione selectedValue)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.item = item;
		this.valori = new ArrayList<Opzione>();
		this.selectedValue = selectedValue;
		this.descrizioneCaratteristica = descrizioneCaratteristica;
		this.caraIdentity = new CaratteristicaIdentity(caratteristicaId, item, caratteristicaOrder);
		this.dataInizioValidita = new Date(1970,1,1,0,0,0);
		this.dataFineValidita = new Date(2039,12,31,23,59,59);
	}
	
	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String item)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.item = item;
		this.valori = new ArrayList<Opzione>();
		this.selectedValue = new Opzione("","");
		this.descrizioneCaratteristica = descrizioneCaratteristica;
		this.caraIdentity = new CaratteristicaIdentity(caratteristicaId, item, caratteristicaOrder);
		this.dataInizioValidita = new Date(1970,1,1,0,0,0);
		this.dataFineValidita = new Date(2039,12,31,23,59,59);
	}
	
	public Caratteristica()
	{
		this.caratteristicaId = "";
		this.caratteristicaOrder = 0;
		this.item = "";
		this.valori = new ArrayList<Opzione>();
		this.selectedValue = new Opzione("","");
		this.descrizioneCaratteristica = "";
		this.caraIdentity = null;
		this.dataInizioValidita = new Date(1970,1,1,0,0,0);
		this.dataFineValidita = new Date(2039,12,31,23,59,59);
	}

	public int getCaratteristicaOrder() {
		return caratteristicaOrder;
	}

	public void setCaratteristicaOrder(int caratteristicaOrder) {
		this.caratteristicaOrder = caratteristicaOrder;
	}
	
	public int getSequenza()
	{
		return getCaratteristicaOrder();
	}
	
	public void setSequenza(int sequenza)
	{
		this.setCaratteristicaOrder(sequenza);
	}
	
	public String getDescrizione()
	{
		return getDescrizioneCaratteristica();
	}
	
	public void setDescrizione(String descrizione)
	{
		this.setDescrizioneCaratteristica(descrizione);
	}


	public ArrayList<Opzione> getValori() {
		return valori;
	}

	public void setValori(ArrayList<Opzione> valori) {
		this.valori = valori;
	}

	public String getCaratteristica() {
		return caratteristicaId;
	}
	
	public void setCaratteristica(String caratteristica) {
		this.caratteristicaId = caratteristica;
	}

	public String getItem() {
		return item;
	}
	
	public void setItem(String item)
	{
		this.item = item;
	}
	
	public CaratteristicaIdentity getCaraIdentity() {
		return caraIdentity;
	}

	public void setCaraIdentity(CaratteristicaIdentity caraIdentity) {
		this.caraIdentity = caraIdentity;
	}

	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}

	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	public void setCaratteristicaId(String caratteristicaId) {
		this.caratteristicaId = caratteristicaId;
	}

	public void setDescrizioneCaratteristica(String descrizioneCaratteristica) {
		this.descrizioneCaratteristica = descrizioneCaratteristica;
	}

	private ArrayList<Opzione> setListOfValues()
	{
		return ReadDB.getOpzioniList(this.item, this.caratteristicaId);
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
	
	public Opzione getOpzioneFromOpzioneList(String value) {
		for(Opzione valore : valori)
		{
			if(valore.getOpzione().toString().equalsIgnoreCase(value))
				return valore;
		}
		return null;
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
