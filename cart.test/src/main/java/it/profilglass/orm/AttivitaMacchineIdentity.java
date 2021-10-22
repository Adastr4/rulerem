package it.profilglass.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

@Embeddable
public class AttivitaMacchineIdentity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name="attivita", insertable = false, updatable = false)
	private String attivita;
	
	@NotNull
	@Column(name="IdMacchina", insertable = false, updatable = false)
	private String idMacchina;
	
	public AttivitaMacchineIdentity(String attivita, String macchina)
	{
		this.attivita = attivita;
		this.idMacchina = macchina;
	}
	
	public AttivitaMacchineIdentity()
	{
		this.attivita = "";
		this.idMacchina = "";
	}

	public String getAttivita() {
		return attivita;
	}

	public void setAttivita(String attivita) {
		this.attivita = attivita;
	}

	public String getIdMacchina() {
		return idMacchina;
	}

	public void setIdMacchina(String macchina) {
		this.idMacchina = macchina;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttivitaMacchineIdentity that = (AttivitaMacchineIdentity) o;

        if (!attivita.equals(that.attivita)) return false;
        return idMacchina.equals(that.idMacchina);
    }

    @Override
    public int hashCode() {
        int result = idMacchina.hashCode();
        result = 31 * result + attivita.hashCode();
        return result;
    }
}
