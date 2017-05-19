package chapter11exercise15;

import java.text.DecimalFormat;

public abstract class Loan implements LoanConstants
{
	protected int loanNumber;
	protected String customerLastName;
	protected int loanAmount;
	protected double interestRate;
	protected int termOfLoan;
	protected String typeOfLoan;

	/**
	 * builds a loan
	 * @param loanNumber - the loan number
	 * @param customerLastName - customer last name
	 * @param loanAmount - the loan amount
	 * @param termOfLoan - the term of the loan
	 */
	public Loan(int loanNumber, String customerLastName, int loanAmount,
			int termOfLoan)
	{
		if(loanAmount > MAXIMUM_LOAN)
		{
			this.loanAmount = 0;
		}
		else
		{
			this.loanAmount = loanAmount;
		}
		this.loanNumber = loanNumber;
		this.customerLastName = customerLastName;
		if(termOfLoan != LONG_TERM && termOfLoan != SHORT_TERM
				&& termOfLoan != MEDIUM_TERM)
		{
			this.termOfLoan = SHORT_TERM;
		}
		else
		{
			this.termOfLoan = termOfLoan;
		}
	}

	/**
	 * makes the object a string
	 * @return - the string form of the object
	 */
	public String toString()
	{
		DecimalFormat format = new DecimalFormat("#.00###");

		return "\t\t\t" + this.typeOfLoan + "\n\tFrom: " + COMPANY_NAME
				+ "\t\tT0: " + this.customerLastName + "\n\tTerm: "
				+ this.termOfLoan + "\tLoan Number: " + this.loanNumber
				+ "\n\tAmount: " + this.loanAmount + "\tInterest Rate: "
				+ format.format(this.interestRate);
	}
}
