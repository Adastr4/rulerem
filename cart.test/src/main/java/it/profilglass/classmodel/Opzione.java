package it.profilglass.classmodel;

public class Opzione implements Comparable<Opzione>{
	private String opzione;
	private String descrizione;
	
	public Opzione(String opzione, String descrizione)
	{
		this.opzione = opzione;
		this.descrizione = descrizione;
	}
	
	public Opzione(String opzione)
	{
		this.opzione = opzione;
		this.descrizione = "";
	}

	public String getOpzione() {
		return opzione;
	}
	
	public int getOpzioneToInt() {
		return Integer.parseInt(opzione);
	}

	public void setOpzione(String opzione) {
		this.opzione = opzione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public int compareTo(Opzione o) {
		    if (getOpzione() == null || o.getOpzione() == null) {
		      return 0;
		    }
		    return getOpzione().compareTo(o.getOpzione());
	}
	
	
}
