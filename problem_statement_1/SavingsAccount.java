package problem_statement_1;

public class SavingsAccount extends Account{
	
	void calculateInterest(float p, float n, float r) {
		float interest = p * n * r;
		super.setInterest(interest);
	}

}
