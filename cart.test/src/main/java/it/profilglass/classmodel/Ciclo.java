package it.profilglass.classmodel;

import java.util.List;

import it.profilglass.orm.CicloTestata;
import it.profilglass.orm.DataManagement;

public class Ciclo {
	private List<Operazione> operazioni;
	private String idCiclo;
	private boolean isStandard;
	private CicloTestata ciclo;
	private int revisione;
	private String codiceArticolo;
	
	public Ciclo(String idCiclo, List<Operazione> operazioni, boolean isStandard, int revisione, String codiceArticolo)
	{
		this.idCiclo = idCiclo;
		this.operazioni = operazioni;
		this.isStandard = isStandard;
		this.ciclo = DataManagement.readCicloTestataById(idCiclo, codiceArticolo, revisione);
	}
	
	public Ciclo(String idCiclo, List<Operazione> operazioni, boolean isStandard, CicloTestata ciclo, int revisione, String codiceArticolo)
	{
		this.idCiclo = idCiclo;
		this.operazioni = operazioni;
		this.isStandard = isStandard;
		this.ciclo = ciclo;
		this.codiceArticolo = codiceArticolo;
		this.revisione = revisione;
	}
	
	public Ciclo(String idCiclo, List<Operazione> operazioni, boolean isStandard)
	{
		this.idCiclo = idCiclo;
		this.operazioni = operazioni;
		this.isStandard = isStandard;
		this.ciclo = null;
		this.codiceArticolo = "";
		this.revisione = 0;
	}

	public List<Operazione> getOperazioni() {
		return operazioni;
	}

	public void setOperazioni(List<Operazione> operazioni) {
		this.operazioni = operazioni;
	}

	public String getIdCiclo() {
		return idCiclo;
	}

	public void setIdCiclo(String idCiclo) {
		this.idCiclo = idCiclo;
	}

	public boolean isStandard() {
		return isStandard;
	}

	public void setStandard(boolean isStandard) {
		this.isStandard = isStandard;
	}

	public CicloTestata getCiclo() {
		return ciclo;
	}

	public void setCiclo(CicloTestata ciclo) {
		this.ciclo = ciclo;
	}

	public int getRevisione() {
		return revisione;
	}

	public void setRevisione(int revisione) {
		this.revisione = revisione;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}
}
