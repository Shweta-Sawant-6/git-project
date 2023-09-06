package problem_statement_1;

public class Account {
	
	private float interest;
	
	void calculateInterest(float p, float n, float r) {
		this.interest = (p*n*r)/100;
	}
	
	public float setInterest(float interest) {
		return this.interest = interest;
	}

	public float getInterest() {
		return interest;
	}
	
}
