package it.profilglass.classmodel;

import java.util.List;

public abstract class Configuratore {
	
	//LISTA CARATTERISTICHE VALIDE PER TUTTI I CONFIGURATORI
	protected List<Caratteristica> caratteristiche;

	public Configuratore()
	{
		//TO DO: NON POSSO DEFINIRE QUI LE CARATTERISTICHE GENERALI PERCHE GLI ORDINI NEL CONFIGURATORE DI TALI CARATTERISTICHE POSSONO CAMBIARE
	}
	
	public void buildCiclo(GenericItem item)
	{
		//TO DO: DEVE ESSERE IMPLEMENTATO NEI SINGOLI CONFIGURATORI SEPCIFICI 
	}
	
	public Distinta buildDistinta()
	{
		return new Distinta();
	}

}
