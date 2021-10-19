package it.profilglass.classmodel;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

@Embeddable
public class OpzioneIdentity implements Serializable{
	@NotNull
	private String item;
	
	@NotNull
	private String caratteristica;
	
	@NotNull
	private String opzione;
	
	public OpzioneIdentity()
	{
		this.item = "";
		this.caratteristica = "";
		this.opzione = "";
	}
	
	public OpzioneIdentity(String item, String caratteristica, String opzione)
	{
		this.item = item;
		this.caratteristica = caratteristica;
		this.opzione = opzione;
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCaratteristica() {
		return caratteristica;
	}

	public void setCaratteristica(String caratteristica) {
		this.caratteristica = caratteristica;
	}

	public String getOpzione() {
		return opzione;
	}

	public void setOpzione(String opzione) {
		this.opzione = opzione;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpzioneIdentity that = (OpzioneIdentity) o;

        if (!item.equals(that.item) || !caratteristica.equals(that.caratteristica)) return false;
        return opzione.equals(that.opzione);
    }

    @Override
    public int hashCode() {
        int result = item.hashCode();
        result = 31 * result + caratteristica.hashCode();
        result = 31 * result + opzione.hashCode();
        return result;
    }
}
