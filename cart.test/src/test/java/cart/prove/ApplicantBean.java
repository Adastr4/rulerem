package cart.prove;

public class ApplicantBean {
	private int creditScore;
	private double cashOnHand;
	private boolean firstTimeHomeBuyer;

	public ApplicantBean(int creditScore, double cashOnHand, boolean firstTimeHomeBuyer) {
		this.creditScore = creditScore;
		this.cashOnHand = cashOnHand;
		this.firstTimeHomeBuyer = firstTimeHomeBuyer;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public boolean isFirstTimeHomeBuyer() {
		return firstTimeHomeBuyer;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public void setFirstTimeHomeBuyer(boolean firstTimeHomeBuyer) {
		this.firstTimeHomeBuyer = firstTimeHomeBuyer;
	}
}
