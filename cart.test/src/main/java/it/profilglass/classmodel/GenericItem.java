package it.profilglass.classmodel;

import java.util.List;

public class GenericItem {
	private List<Ciclo> ciclo;
	private String codiceArticolo;
	private String classe;

	public GenericItem(String codiceArticolo, String classe, List<Ciclo> cicli)
	{
		this.codiceArticolo = codiceArticolo;
		this.ciclo = cicli;
		this.classe = classe;
	}

	public List<Ciclo> getCicli() {
		return ciclo;
	}

	public Ciclo getCicloAtIndex(int index)
	{
		return ciclo.get(index);
	}

	public String getClasse() {
		return classe;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public Ciclo getStandardCiclo()
	{
		Ciclo retValue = null;

		for(Ciclo cicloSing : this.ciclo)
		{
			if(cicloSing.isStandard())
				retValue = cicloSing;
		}

		return retValue;
	}

	public void setCiclo(List<Ciclo> ciclo) {
		this.ciclo = ciclo;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}
}
