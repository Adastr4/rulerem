package it.profilglass.classmodel;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jboss.logging.Property;

import test.test.ReadDB;

@Entity
@Table(name = "conf_caratteristiche")
public class Caratteristica implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CaratteristicaIdentity caraIdentity;
	
	@Column(name="caratteristica", insertable = false, updatable = false)
	private String caratteristicaId;
	
	@Column(name="Descrizione")
	private String descrizioneCaratteristica;
	
	@Column(name="Sequenza", insertable = false, updatable = false)
	private int caratteristicaOrder;
	
	@Column(name="Item", insertable = false, updatable = false)
	private String item;
	
	@OneToMany(mappedBy="caratteristicaObj", fetch = FetchType.LAZY)
	private List<Opzione> valori;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DataInizioValidita")
	private Date dataInizioValidita;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DataFineValidita")
	private Date dataFineValidita;
	
	@Transient
	private Opzione selectedValue;
	
	@Transient
	private boolean enabled = false;
	
	@Transient
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


	public List<Opzione> getValori() {
		return valori;
	}

	public void setValori(List<Opzione> valori) {
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
