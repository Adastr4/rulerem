package it.profilglass.classmodel;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Caratteristica implements ICaratteristica {

	private String caratteristicaId;
	private String descrizioneCaratteristica;
	private int caratteristicaOrder;
	private String classe;
	private ArrayList<Opzione> valori;
	private String selectedValue;
	private boolean enabled = false;
	private boolean visible = false;

	public Caratteristica(BigDecimal bigDecimal, String cLLEGA, String cLSTATF, String string, String string2,
			String cLFINI, String cLASSE2) {
		// TODO Auto-generated constructor stub
	}

	public Caratteristica(BigDecimal cLSPESS, String cLLEGA, String cLSTATF, String sLBPTE, String sLBP, String cLFINI,
			String cLASSE2, String cLLARG, String cLLUNG, String cLRIVE, String cLTOLLE, String dLDEST, String dLLAV,
			String dLLUBRI, String mLSTATF, String pLACKG, String pMETC, String qSPEC, String sLTOLLA, String dLLATOLP,
			String dLLATOLN, String sLLATOLP, String sLLATOLN, int i, int j, String sLLANAS, String qLLAVDET,
			String sLMOD, String qLLAV) {
		// TODO Auto-generated constructor stub
	}

	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String classe)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = this.setListOfValues();
		this.selectedValue = "";
		this.descrizioneCaratteristica = descrizioneCaratteristica;
	}

	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String classe, ArrayList<Opzione> valori, String selectedValue)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = valori;
		this.selectedValue = selectedValue;
		this.descrizioneCaratteristica = descrizioneCaratteristica;
	}

	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder, String classe, String selectedValue)
	{
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = this.setListOfValues();
		this.selectedValue = selectedValue;
		this.descrizioneCaratteristica = descrizioneCaratteristica;
	}

	private Opzione deleteElementAt(int index)
	{
		return this.valori.remove(index);
	}

	private boolean deleteElementByObject(Opzione opz)
	{
		return this.valori.remove(opz);
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

	@Override
	public int getBandellineNumInSLLANAS() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCaratteristicaId() {
		return caratteristicaId;
	}

	@Override
	public int getCaratteristicaOrder() {
		return caratteristicaOrder;
	}

	@Override
	public String getClasse() {
		return classe;
	}

	@Override
	public String getCLASSE() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCLFINI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCLLARG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCLLEGA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCLLUNG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCLRIVE() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCLSPESS() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCLSTATF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCLTOLLE() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescrizioneCaratteristica() {
		return descrizioneCaratteristica;
	}

	@Override
	public String getDLDEST() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDLLATOLN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDLLATOLP() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMLSTATF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getQLLAV() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getQLLAVDET() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSBATIPO() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSelectedValue() {
		return selectedValue;
	}

	@Override
	public int getSETICC() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSLBP() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSLBPTE() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSLLANASLarg() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSLLATOLN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSLLATOLP() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSLMOD() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSLTMAX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSLTOLLA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Opzione> getValori() {
		return valori;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public boolean isVisible() {
		return visible;
	}

	@Override
	public void setCaratteristicaOrder(int caratteristicaOrder) {
		this.caratteristicaOrder = caratteristicaOrder;
	}

	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	private ArrayList<Opzione> setListOfValues()
	{
		return ReadDB.getOpzioniList(this.classe, this.caratteristicaId);
	}

	@Override
	public void setSelectedValue(String selectedValue) {
		this.selectedValue = selectedValue;
	}

	@Override
	public void setValori(ArrayList<Opzione> valori) {
		this.valori = valori;
	}

	@Override
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
