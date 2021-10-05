package it.profilglass.classmodel;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author nodejs
 *
 */
public class Caratteristica implements ICaratteristica {

	/**
	 *
	 */
	private String caratteristicaId;
	/**
	 *
	 */
	private int caratteristicaOrder;
	/**
	 *
	 */
	private String classe;
	/**
	 *
	 */
	private ArrayList<Opzione> valori;
	/**
	 *
	 */
	private boolean enabled = false;
	/**
	 *
	 */
	private boolean visible = false;
	/**
	 *
	 */
	private BigDecimal CLSPESS;
	/**
	 *
	 */
	private String CLLEGA;
	/**
	 *
	 */
	private String CLSTATF;
	/**
	 *
	 */
	private String SLBPTE;
	/**
	 *
	 */
	private String SLBP;
	/**
	 *
	 */
	private String CLFINI;
	/**
	 *
	 */
	private String CLASSE;
	/**
	 *
	 */
	private String CLLARG;
	/**
	 *
	 */
	private String CLLUNG;
	/**
	 *
	 */
	private String CLRIVE;
	/**
	 *
	 */
	private String CLTOLLE;
	/**
	 *
	 */
	private String DLDEST;
	/**
	 *
	 */
	private String DLLAV;
	/**
	 *
	 */
	private String DLLUBRI;
	/**
	 *
	 */
	private String MLSTATF;
	/**
	 *
	 */
	private String PLACKG;
	/**
	 *
	 */
	private String PMETC;
	/**
	 *
	 */
	private String QSPEC;
	/**
	 *
	 */
	private String SLTOLLA;
	/**
	 *
	 */
	private String DLLATOLP;
	/**
	 *
	 */
	private String DLLATOLN;
	/**
	 *
	 */
	private String SLLATOLP;
	/**
	 *
	 */
	private String SLLATOLN;
	/**
	 *
	 */
	private String SLLANAS;
	/**
	 *
	 */
	private String QLLAVDET;
	/**
	 *
	 */
	private String SLMOD;
	/**
	 *
	 */
	private String QLLAV;
	/**
	 *
	 */
	private int SLTMAX;
	/**
	 *
	 */
	private int SBATIPO;
	/**
	 *
	 */
	int SETICC;

	/**
	 * @param bigDecimal
	 * @param string
	 * @param string2
	 * @param string3
	 * @param string4
	 * @param string5
	 * @param string6
	 */
	public Caratteristica(BigDecimal bigDecimal, String string, String string2, String string3, String string4,
			String string5, String string6) {
		this(bigDecimal, string, string2, string3, string4, string5, string6, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null);
	}

	/**
	 * @param CLSPESS
	 * @param CLLEGA
	 * @param CLSTATF
	 * @param SLBPTE
	 * @param SLBP
	 * @param CLFINI
	 * @param CLASSE
	 * @param CLLARG
	 * @param CLLUNG
	 * @param CLRIVE
	 * @param CLTOLLE
	 * @param DLDEST
	 * @param DLLAV
	 * @param DLLUBRI
	 * @param MLSTATF
	 * @param PLACKG
	 * @param PMETC
	 * @param QSPEC
	 * @param SLTOLLA
	 * @param DLLATOLP
	 * @param DLLATOLN
	 * @param SLLATOLP
	 * @param SLLATOLN
	 * @param SLTMAX
	 * @param SBATIPO
	 * @param SLLANAS
	 * @param QLLAVDET
	 * @param SLMOD
	 * @param QLLAV
	 */
	public Caratteristica(BigDecimal CLSPESS, String CLLEGA, String CLSTATF, String SLBPTE, String SLBP, String CLFINI,
			String CLASSE, String CLLARG, String CLLUNG, String CLRIVE, String CLTOLLE, String DLDEST, String DLLAV,
			String DLLUBRI, String MLSTATF, String PLACKG, String PMETC, String QSPEC, String SLTOLLA, String DLLATOLP,
			String DLLATOLN, String SLLATOLP, String SLLATOLN, int SLTMAX, int SBATIPO, String SLLANAS, String QLLAVDET,
			String SLMOD, String QLLAV) {
		this.CLSPESS = CLSPESS;
		this.CLLEGA = CLLEGA;
		this.CLSTATF = CLSTATF;
		this.SLBPTE = SLBPTE;
		this.SLBP = SLBP;
		this.CLFINI = CLFINI;
		this.CLASSE = CLASSE;
		this.CLLARG = CLLARG;
		this.CLLUNG = CLLUNG;
		this.CLRIVE = CLRIVE;
		this.CLTOLLE = CLTOLLE;
		this.DLDEST = DLDEST;
		this.DLLAV = DLLAV;
		this.DLLUBRI = DLLUBRI;
		this.MLSTATF = MLSTATF;
		this.PLACKG = PLACKG;
		this.PMETC = PMETC;
		this.QSPEC = QSPEC;
		this.SLTOLLA = SLTOLLA;
		this.DLLATOLP = DLLATOLP;
		this.DLLATOLN = DLLATOLN;
		this.SLLATOLP = SLLATOLP;
		this.SLLATOLN = SLLATOLN;
		this.SLTMAX = SLTMAX;
		this.SBATIPO = SBATIPO;
		this.SLLANAS = SLLANAS;
		this.QLLAVDET = QLLAVDET;
		this.SLMOD = SLMOD;
		this.QLLAV = QLLAV;
	}

	/**
	 * @param caratteristicaId
	 * @param descrizioneCaratteristica
	 * @param caratteristicaOrder
	 * @param classe
	 */
	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder,
			String classe) {
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = this.setListOfValues();
	}

	/**
	 * @param caratteristicaId
	 * @param descrizioneCaratteristica
	 * @param caratteristicaOrder
	 * @param classe
	 * @param valori
	 * @param selectedValue
	 */
	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder,
			String classe, ArrayList<Opzione> valori, String selectedValue) {
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = valori;
	}

	/**
	 * @param caratteristicaId
	 * @param descrizioneCaratteristica
	 * @param caratteristicaOrder
	 * @param classe
	 * @param selectedValue
	 */
	public Caratteristica(String caratteristicaId, String descrizioneCaratteristica, int caratteristicaOrder,
			String classe, String selectedValue) {
		this.caratteristicaId = caratteristicaId;
		this.caratteristicaOrder = caratteristicaOrder;
		this.classe = classe;
		this.valori = this.setListOfValues();
	}

	/**
	 * @param index
	 * @return
	 */
	private int convertSLLANASIndex(String index) {
		int returnValue = 0;
		switch (index) {
		case "A":
		case "C":
		case "K":
		case "G":
		case "J":
			returnValue = 40;
			break;
		case "I":
		case "L":
			returnValue = 80;
			break;
		case "W":
			returnValue = 30;
			break;
		case "Z":
		case "Y":
			returnValue = 70;
			break;
		default:
			returnValue = 0;
		}

		return returnValue;
	}

	/**
	 *
	 */
	@Override
	public int getBandellineNumInSLLANAS() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 *
	 */
	@Override
	public String getCaratteristicaId() {
		return caratteristicaId;
	}

	/**
	 *
	 */
	@Override
	public int getCaratteristicaOrder() {
		return caratteristicaOrder;
	}

	

	/**
	 *
	 */
	@Override
	public String getClasse() {
		if (CLASSE == null) {
			CLASSE = ReadDB.readClasse();
		}
		return CLASSE;
	}

	/**
	 *
	 */
	@Override
	public String getCLFINI() {
		return CLFINI;
	}

	/**
	 *
	 */
	@Override
	public String getCLLARG() {
		return CLLARG;
	}

	/**
	 *
	 */
	@Override
	public String getCLLEGA() {
		return CLLEGA;
	}

	/**
	 *
	 */
	@Override
	public String getCLLUNG() {
		return CLLUNG;
	}

	/**
	 *
	 */
	@Override
	public String getCLRIVE() {
		return CLRIVE;
	}

	/**
	 *
	 */
	@Override
	public BigDecimal getCLSPESS() {
		return CLSPESS;
	}

	/**
	 *
	 */
	@Override
	public String getCLSTATF() {
		return CLSTATF;
	}

	/**
	 *
	 */
	@Override
	public String getCLTOLLE() {
		return CLTOLLE;
	}

	/**
	 *
	 */
	@Override
	public String getDescrizioneCaratteristica() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *
	 */
	@Override
	public String getDLDEST() {
		return DLDEST;
	}

	/**
	 *
	 */
	@Override
	public String getDLLATOLN() {
		return DLLATOLN;
	}

	/**
	 *
	 */
	@Override
	public String getDLLATOLP() {
		return DLLATOLP;
	}

	/**
	 * @return
	 */
	public String getDLLAV() {
		return DLLAV;
	}

	/**
	 * @return
	 */
	public String getDLLUBRI() {
		return DLLUBRI;
	}

	/**
	 *
	 */
	@Override
	public String getMLSTATF() {
		return MLSTATF;
	}

	/**
	 * @return
	 */
	public String getPLACKG() {
		return PLACKG;
	}

	/**
	 * @return
	 */
	public String getPMETC() {
		return PMETC;
	}

	/**
	 *
	 */
	@Override
	public String getQLLAV() {
		return QLLAV;
	}

	/**
	 *
	 */
	@Override
	public String getQLLAVDET() {
		return QLLAVDET;
	}

	/**
	 * @return
	 */
	public String getQSPEC() {
		return QSPEC;
	}

	/**
	 *
	 */
	@Override
	public int getSBATIPO() {
		return SBATIPO;
	}

	/**
	 *
	 */
	@Override
	public String getSelectedValue() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *
	 */
	@Override
	public int getSETICC() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 *
	 */
	@Override
	public String getSLBP() {
		return SLBP;
	}

	/**
	 *
	 */
	@Override
	public String getSLBPTE() {
		return SLBPTE;
	}

	/**
	 * @return
	 */
	public String getSLLANAS() {
		return SLLANAS;
	}

	/**
	 *
	 */
	@Override
	public int getSLLANASLarg() {
		String SLLANASletter = "";
		String SLLANASDim = "";

		try {
			SLLANASletter = this.getSLLANAS().substring(2, 3);
			SLLANASDim = this.getSLLANAS().substring(3, this.getSLLANAS().length());
			return (Integer.parseInt(SLLANASDim) + this.convertSLLANASIndex(SLLANASletter));
		} catch (final Exception ex) {
			return 0;
		}
	}

	/**
	 *
	 */
	@Override
	public String getSLLATOLN() {
		return SLLATOLN;
	}

	/**
	 *
	 */
	@Override
	public String getSLLATOLP() {
		return SLLATOLP;
	}

	/**
	 *
	 */
	@Override
	public String getSLMOD() {
		return SLMOD;
	}

	/**
	 *
	 */
	@Override
	public int getSLTMAX() {
		return SLTMAX;
	}

	/**
	 *
	 */
	@Override
	public String getSLTOLLA() {
		return SLTOLLA;
	}

	/**
	 *
	 */
	@Override
	public ArrayList<Opzione> getValori() {
		return valori;
	}

	/**
	 *
	 */
	@Override
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 *
	 */
	@Override
	public boolean isVisible() {
		return visible;
	}

	/**
	 *
	 */
	@Override
	public void setCaratteristicaOrder(int caratteristicaOrder) {
		this.caratteristicaOrder = caratteristicaOrder;
	}

	/**
	 * @param CLASSE
	 */
	public void setCLASSE(String CLASSE) {
		this.CLASSE = CLASSE;
	}

	/**
	 * @param CLFINI
	 */
	public void setCLFINI(String CLFINI) {
		this.CLFINI = CLFINI;
	}

	/**
	 * @param cLLARG
	 */
	public void setCLLARG(String cLLARG) {
		CLLARG = cLLARG;
	}

	/**
	 * @param CLLEGA
	 */
	public void setCLLEGA(String CLLEGA) {
		this.CLLEGA = CLLEGA;
	}

	/**
	 * @param cLLUNG
	 */
	public void setCLLUNG(String cLLUNG) {
		CLLUNG = cLLUNG;
	}

	/**
	 * @param cLRIVE
	 */
	public void setCLRIVE(String cLRIVE) {
		CLRIVE = cLRIVE;
	}

	/**
	 * @param CLSPESS
	 */
	public void setCLSPESS(BigDecimal CLSPESS) {
		this.CLSPESS = CLSPESS;
	}

	/**
	 * @param CLSTATF
	 */
	public void setCLSTATF(String CLSTATF) {
		this.CLSTATF = CLSTATF;
	}

	/**
	 * @param cLTOLLE
	 */
	public void setCLTOLLE(String cLTOLLE) {
		CLTOLLE = cLTOLLE;
	}

	/**
	 * @param dLDEST
	 */
	public void setDLDEST(String dLDEST) {
		DLDEST = dLDEST;
	}

	/**
	 * @param dLLATOLN
	 */
	public void setDLLATOLN(String dLLATOLN) {
		DLLATOLN = dLLATOLN;
	}

	/**
	 * @param dLLATOLP
	 */
	public void setDLLATOLP(String dLLATOLP) {
		DLLATOLP = dLLATOLP;
	}

	/**
	 * @param dLLAV
	 */
	public void setDLLAV(String dLLAV) {
		DLLAV = dLLAV;
	}

	/**
	 * @param dLLUBRI
	 */
	public void setDLLUBRI(String dLLUBRI) {
		DLLUBRI = dLLUBRI;
	}

	/**
	 *
	 */
	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return
	 */
	private ArrayList<Opzione> setListOfValues() {
		return ReadDB.getOpzioniList(this.classe, this.caratteristicaId);
	}

	/**
	 * @param mLSTATF
	 */
	public void setMLSTATF(String mLSTATF) {
		MLSTATF = mLSTATF;
	}

	/**
	 * @param pLACKG
	 */
	public void setPLACKG(String pLACKG) {
		PLACKG = pLACKG;
	}

	/**
	 * @param pMETC
	 */
	public void setPMETC(String pMETC) {
		PMETC = pMETC;
	}

	/**
	 * @param qLLAV
	 */
	public void setQLLAV(String qLLAV) {
		QLLAV = qLLAV;
	}

	/**
	 * @param qLLAVDET
	 */
	public void setQLLAVDET(String qLLAVDET) {
		QLLAVDET = qLLAVDET;
	}

	/**
	 * @param qSPEC
	 */
	public void setQSPEC(String qSPEC) {
		QSPEC = qSPEC;
	}

	/**
	 * @param sBATIPO
	 */
	public void setSBATIPO(int sBATIPO) {
		SBATIPO = sBATIPO;
	}

	/**
	 *
	 */
	@Override
	public void setSelectedValue(String selectedValue) {
	}

	/**
	 * @param SLBP
	 */
	public void setSLBP(String SLBP) {
		this.SLBP = SLBP;
	}

	/**
	 * @param SLBPTE
	 */
	public void setSLBPTE(String SLBPTE) {
		this.SLBPTE = SLBPTE;
	}

	/**
	 * @param sLLANAS
	 */
	public void setSLLANAS(String sLLANAS) {
		SLLANAS = sLLANAS;
	}

	/**
	 * @param sLLATOLN
	 */
	public void setSLLATOLN(String sLLATOLN) {
		SLLATOLN = sLLATOLN;
	}

	/**
	 * @param sLLATOLP
	 */
	public void setSLLATOLP(String sLLATOLP) {
		SLLATOLP = sLLATOLP;
	}

	/**
	 * @param sLMOD
	 */
	public void setSLMOD(String sLMOD) {
		SLMOD = sLMOD;
	}

	/**
	 * @param sLTMAX
	 */
	public void setSLTMAX(int sLTMAX) {
		SLTMAX = sLTMAX;
	}

	/**
	 * @param sLTOLLA
	 */
	public void setSLTOLLA(String sLTOLLA) {
		SLTOLLA = sLTOLLA;
	}

	/**
	 *
	 */
	@Override
	public void setValori(ArrayList<Opzione> valori) {
		this.valori = valori;
	}

	/**
	 *
	 */
	@Override
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
