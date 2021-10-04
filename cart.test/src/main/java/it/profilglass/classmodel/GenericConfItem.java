package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

public class GenericConfItem {

	private Configuratore conf;
	private List<LivelloDistinta> distinta;
	private String classe;


	public GenericConfItem(Configuratore conf, List<LivelloDistinta> distinta, String classe)
	{
		this.conf = conf;
		this.distinta = distinta;
		this.classe = classe;
	}

	public GenericConfItem(Configuratore conf, String classe)
	{
		this.conf = conf;
		this.classe = classe;
		this.distinta = new ArrayList<>();
	}


	public Configuratore getConf() {
		return conf;
	}


	public void setConf(Configuratore conf) {
		this.conf = conf;
	}


	public List<LivelloDistinta> getDistinta() {
		return distinta;
	}


	public void setDistinta(List<LivelloDistinta> distinta) {
		this.distinta = distinta;
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}
}
