package it.profilglass.classmodel;

public class GenericConfItem {
	
	private Configuratore conf;
	private Distinta distinta;
	private String classe;
	
	
	public GenericConfItem(Configuratore conf, Distinta distinta, String classe)
	{
		this.conf = conf;
		this.distinta = distinta;
		this.classe = classe;
	}
	
	public GenericConfItem(Configuratore conf, String classe)
	{
		this.conf = conf;
		this.classe = classe;
		this.distinta = new Distinta();
	}


	public Configuratore getConf() {
		return conf;
	}


	public void setConf(Configuratore conf) {
		this.conf = conf;
	}


	public Distinta getDistinta() {
		return distinta;
	}


	public void setDistinta(Distinta distinta) {
		this.distinta = distinta;
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}
}
