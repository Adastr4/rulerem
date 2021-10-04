package it.profilglass.classmodel;

import java.util.ArrayList;

public interface ICaratteristica {

	int getCaratteristicaOrder();

	void setCaratteristicaOrder(int caratteristicaOrder);

	ArrayList<Opzione> getValori();

	void setValori(ArrayList<Opzione> valori);

	String getCaratteristicaId();

	String getClasse();

	String getSelectedValue();

	void setSelectedValue(String selectedValue);

	String getDescrizioneCaratteristica();

	boolean isEnabled();

	void setEnabled(boolean enabled);

	boolean isVisible();

	void setVisible(boolean visible);

	String getSLTOLLA();

	String getCLFINI();

	String getCLLEGA();

	String getQLLAVDET();

	Integer getCLSPESS();

	String getSLMOD();

	String getCLSTATF();

	String getCLLARG();

	String getCLTOLLE();

	String getCLRIVE();

	int getBandellineNumInSLLANAS();

	String getSLBP();

	String getQLLAV();

	String getSLBPTE();

	String getCLLUNG();

	int getSLLANASLarg();

	String getDLDEST();

	int getSBATIPO();

	String getDLLATOLN();

	String getSLLATOLP();

	String getSLLATOLN();

	String getDLLATOLP();

	int getSETICC();

	int getSLTMAX();

	String getMLSTATF();

}