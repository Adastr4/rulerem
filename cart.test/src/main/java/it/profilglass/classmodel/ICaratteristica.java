package it.profilglass.classmodel;

import java.util.ArrayList;

public interface ICaratteristica {

	int getBandellineNumInSLLANAS();

	String getCaratteristicaId();

	int getCaratteristicaOrder();

	String getClasse();

	String getCLASSE();

	String getCLFINI();

	String getCLLARG();

	String getCLLEGA();

	String getCLLUNG();

	String getCLRIVE();

	Integer getCLSPESS();

	String getCLSTATF();

	String getCLTOLLE();

	String getDescrizioneCaratteristica();

	String getDLDEST();

	String getDLLATOLN();

	String getDLLATOLP();

	String getMLSTATF();

	String getQLLAV();

	String getQLLAVDET();

	int getSBATIPO();

	String getSelectedValue();

	int getSETICC();

	String getSLBP();

	String getSLBPTE();

	int getSLLANASLarg();

	String getSLLATOLN();

	String getSLLATOLP();

	String getSLMOD();

	int getSLTMAX();

	String getSLTOLLA();

	ArrayList<Opzione> getValori();

	boolean isEnabled();

	boolean isVisible();

	void setCaratteristicaOrder(int caratteristicaOrder);

	void setEnabled(boolean enabled);

	void setSelectedValue(String selectedValue);

	void setValori(ArrayList<Opzione> valori);

	void setVisible(boolean visible);

}