package it.profilglass.classmodel;

import java.util.List;

public class Ciclo {



	private List<Operazione> operazioni;



	private String idCiclo;

	private boolean isStandard;
	public Ciclo(String idCiclo, List<Operazione> operazioni, boolean isStandard)
	{
		this.idCiclo = idCiclo;
		this.operazioni = operazioni;
		this.isStandard = isStandard;
	}
	public String getIdCiclo() {
		return idCiclo;
	}

	public List<Operazione> getOperazioni() {
		return operazioni;
	}



	public boolean isStandard() {
		return isStandard;
	}

	public void setIdCiclo(String idCiclo) {
		this.idCiclo = idCiclo;
	}

	public void setOperazioni(List<Operazione> operazioni) {
		this.operazioni = operazioni;
	}

	public void setStandard(boolean isStandard) {
		this.isStandard = isStandard;
	}


}
