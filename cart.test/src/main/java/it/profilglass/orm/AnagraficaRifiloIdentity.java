package it.profilglass.orm;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class AnagraficaRifiloIdentity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String item;
	
	@NotNull
	private String finitura;
	
	@NotNull
	private String statoFisico;
	
	@NotNull
	private float spessoreDa;
	
	@NotNull
	private float spessoreA;
	
	@NotNull
	private float larghezzaDa;
	
	@NotNull
	private float larghezzaA;
	
	public AnagraficaRifiloIdentity(String item, String finitura, String statoFisico, float spessoreDa, float spessoreA, float larghezzaDa, float larghezzaA)
	{
		this.item = item;
		this.finitura = finitura;
		this.statoFisico = statoFisico;
		this.spessoreDa = spessoreDa;
		this.spessoreA = spessoreA;
		this.larghezzaDa = larghezzaDa;
		this.larghezzaA = larghezzaA;
	}
	
	public AnagraficaRifiloIdentity()
	{
		this.item = "";
		this.finitura = "";
		this.statoFisico = "";
		this.spessoreDa = 0;
		this.spessoreA = 0;
		this.larghezzaDa = 0;
		this.larghezzaA = 0;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getFinitura() {
		return finitura;
	}

	public void setFinitura(String finitura) {
		this.finitura = finitura;
	}

	public String getStatoFisico() {
		return statoFisico;
	}

	public void setStatoFisico(String statoFisico) {
		this.statoFisico = statoFisico;
	}

	public float getSpessoreDa() {
		return spessoreDa;
	}

	public void setSpessoreDa(float spessoreDa) {
		this.spessoreDa = spessoreDa;
	}

	public float getSpessoreA() {
		return spessoreA;
	}

	public void setSpessoreA(float spessoreA) {
		this.spessoreA = spessoreA;
	}

	public float getLarghezzaDa() {
		return larghezzaDa;
	}

	public void setLarghezzaDa(float larghezzaDa) {
		this.larghezzaDa = larghezzaDa;
	}

	public float getLarghezzaA() {
		return larghezzaA;
	}

	public void setLarghezzaA(float larghezzaA) {
		this.larghezzaA = larghezzaA;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnagraficaRifiloIdentity that = (AnagraficaRifiloIdentity) o;

        if (!item.equals(that.item) || !finitura.equals(that.finitura) || !statoFisico.equals(that.statoFisico) || !(spessoreDa == that.spessoreDa) || !(spessoreA == that.spessoreA) || !(larghezzaDa == that.larghezzaDa)) return false;
        return (larghezzaA == that.larghezzaA);
    }

    @Override
    public int hashCode() {
        int result = item.hashCode();
        result = 31 * result + finitura.hashCode();
        result = 31 * result + statoFisico.hashCode();
        result = 31 * result + Float.toString(spessoreDa).hashCode();
        result = 31 * result + Float.toString(spessoreA).hashCode();
        result = 31 * result + Float.toString(larghezzaDa).hashCode();
        result = 31 * result + Float.toString(larghezzaA).hashCode();
        return result;
    }
}
