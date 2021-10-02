package it.profilglass.classmodel;

import static org.junit.jupiter.api.Assertions.*;

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
		item.getConf().getCaratteristicaById("SLLANAS").setSelectedValue("FAB1040");

		List<LivelloDistinta> distinta = item.getConf().buildDistinta();
	
	}

}
