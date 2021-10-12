package it.profilglass.classmodel;

import java.util.ArrayList;

public interface ICaratteristica {

	int getCaratteristicaOrder();

	void setCaratteristicaOrder(int caratteristicaOrder);

	ArrayList<Opzione> getValori();

	void setValori(ArrayList<Opzione> valori);

	String getCaratteristicaId();

	String getClasse();

	Opzione getSelectedValue();

	void setSelectedValue(Opzione selectedValue);

	void setSelectedValueFromOpzioneList(String value);

	Opzione getOpzioneFromOpzioneList(String value);

	String getDescrizioneCaratteristica();

	boolean isEnabled();

	void setEnabled(boolean enabled);

	boolean isVisible();

	void setVisible(boolean visible);

}