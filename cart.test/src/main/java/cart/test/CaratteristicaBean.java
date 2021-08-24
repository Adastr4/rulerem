package cart.test;

import java.math.BigDecimal;

public class CaratteristicaBean {
	private BigDecimal CLSPESS;
	private String CLLEGA;
	private String CLSTATF;
	private String SLBPTE;
	private String SLBP;

	public CaratteristicaBean(BigDecimal CLSPESS, String CLLEGA, String CLSTATF, String SLBPTE, String SLBP) {
		this.CLSPESS = CLSPESS;
		this.CLLEGA = CLLEGA;
		this.CLSTATF = CLSTATF;
		this.SLBPTE = SLBPTE;
		this.SLBP = SLBP;
	}

	public BigDecimal getCLSPESS() {
		return CLSPESS;
	}

	public void setCLSPESS(BigDecimal CLSPESS) {
		this.CLSPESS = CLSPESS;
	}

	public String getCLLEGA() {
		return CLLEGA;
	}

	public void setCLLEGA(String CLLEGA) {
		this.CLLEGA = CLLEGA;
	}

	public String getCLSTATF() {
		return CLSTATF;
	}

	public void setCLSTATF(String CLSTATF) {
		this.CLSTATF = CLSTATF;
	}

	public String getSLBPTE() {
		return SLBPTE;
	}

	public void setSLBPTE(String SLBPTE) {
		this.SLBPTE = SLBPTE;
	}

	public String getSLBP() {
		return SLBP;
	}

	public void setSLBP(String SLBP) {
		this.SLBP = SLBP;
	}

}