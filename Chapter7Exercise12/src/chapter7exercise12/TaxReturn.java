package chapter7exercise12;

public class TaxReturn
{
	private final String SSN;
	private final String LAST_NAME;
	private final String FIRST_NAME;
	private String streetAddress;
	private String cityOfResidence;
	private String zipCode;
	private String stateOfResidence;
	private double annualIncome;
	private String isMarried;
	private double isTaxLiability;

	/**
	 * builds a tax return object
	 * @param socialNum - SSN
	 * @param lastName - last name
	 * @param firstName - first name
	 * @param streetAdd - street address
	 * @param cityOfRes - city of address
	 * @param zip - address zip code
	 * @param stateOfRes - state address is in
	 * @param annIncome - annual income
	 * @param isInLove - marital status
	 */
	public TaxReturn(String socialNum, String lastName, String firstName,
			String streetAdd, String cityOfRes, String zip, String stateOfRes,
			double annIncome, String isInLove)
	{
		this.SSN = socialNum;
		this.LAST_NAME = lastName;
		this.FIRST_NAME = firstName;
		this.streetAddress = streetAdd;
		this.cityOfResidence = cityOfRes;
		this.zipCode = zip;
		this.stateOfResidence = stateOfRes;
		this.annualIncome = annIncome;
		this.isMarried = isInLove;
		if(this.annualIncome <= 20000)
		{
			if(this.isMarried.toLowerCase() == "single")
			{
				this.isTaxLiability = 15.0;
			}
			else
			{
				this.isTaxLiability = 14.0;

			}
		}
		else
		{
			if(this.annualIncome >= 50001)
			{
				if(this.isMarried.toLowerCase() == "single")
				{
					this.isTaxLiability = 30.0;
				}
				else
				{
					this.isTaxLiability = 28.0;
				}
			}
			else
			{
				if(this.isMarried.toLowerCase() == "single")
				{
					this.isTaxLiability = 22.0;
				}
				else
				{
					this.isTaxLiability = 20.0;
				}
			}
		}
	}

	/**
	 * prints the tax return
	 */
	public void getTaxData()
	{
		System.out.printf(
				"\t\t%s %s's tax return\nSSN: %s\tFirst Name: %s"
						+ "\t\tLast Name: %s\nStreet Address: %s\t\tCity: %s\tState: %s"
						+ "\tZip Code: %s\nAnnual Income: $%.2f\tMarried: %s\n\t\tTax "
						+ "Liability: $%.2f",
				this.FIRST_NAME, this.LAST_NAME, this.SSN, this.FIRST_NAME,
				this.LAST_NAME, this.streetAddress, this.cityOfResidence,
				this.stateOfResidence, this.zipCode, this.annualIncome,
				this.isMarried,
				this.annualIncome * (double) (this.isTaxLiability / 100.00));
	}
}
