package chapter11exercise15;

public class BusinessLoan extends Loan
{

	/**
	 * builds a loan
	 * @param loanNumber - the loan number
	 * @param customerLastName - customer last name
	 * @param loanAmount - the loan amount
	 * @param termOfLoan - the term of the loan
	 * @param primeInterest - the prime interest
	 * @param typeOfLoan - the type of loan
	 */
	public BusinessLoan(int loanNumber, String customerLastName, 
			int loanAmount, int termOfLoan, double primeInterest,
			String typeOfLoan)
	{
		super(loanNumber, customerLastName, loanAmount, termOfLoan);
		this.interestRate = .01 + primeInterest;
		this.typeOfLoan = typeOfLoan;
	}

}
