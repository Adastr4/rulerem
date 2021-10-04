package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DistintaTest {

	@Test
	void Distintatest() {
		GenericConfItem item = new GenericConfItem(new ConfiguratoreBAV(), "BAV");
		item.getConf().getCaratteristicaById("CLFINI").setSelectedValue("M");
		item.getConf().getCaratteristicaById("CLLEGA").setSelectedValue("5F");
		item.getConf().getCaratteristicaById("CLSPESS").setSelectedValue("3000");
		item.getConf().getCaratteristicaById("CLSTATF").setSelectedValue("HA1");
		item.getConf().getCaratteristicaById("MLSTATF").setSelectedValue("HA1");
		item.getConf().getCaratteristicaById("CLLARG").setSelectedValue("10000");
		item.getConf().getCaratteristicaById("CLLUNG").setSelectedValue("20000");
		item.getConf().getCaratteristicaById("CLTOLLE").setSelectedValue("N");
		item.getConf().getCaratteristicaById("CLRIVE").setSelectedValue("A");
	//	item.getConf().getCaratteristicaById("SLLANAS").setSelectedValue("FAB1040");


		RunDistintaNew(item).get(0);

	}

	public List<LivelloDistinta> RunDistintaNew(GenericConfItem conf)
	{
		List<LivelloDistinta> distinta = conf.getConf().buildDistinta();
		return distinta;
	}

	@Test
	public void distintaDefault()
	{
		List<LivelloDistinta> distinta = new ArrayList<>();
		distinta.add(new LivelloDistinta(new GenericItem("BA5F3000HA11000020000MNA","BA",null),1,1));
		distinta.add(new LivelloDistinta(new GenericItem("LB5F3000HA1MN","LB",null),2,1));
		distinta.add(new LivelloDistinta(new GenericItem("IMCARG90L1000","IMCAR",null),2,2));
		//return distinta;
	}

}
