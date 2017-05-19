package chapter10exercise3;

public class PetSold extends ItemSold
{
	private boolean isVaccinated;
	private boolean isNeutered;
	private boolean isHousebroken;

	public PetSold(int invoiceNumber, String description, double price,
			boolean isVaccinated, boolean isNeutered, boolean isHousebroken)
	{
		super(invoiceNumber, description, price);
		this.isVaccinated = isVaccinated;
		this.isNeutered = isNeutered;
		this.isHousebroken = isHousebroken;

	}

	/**
	 * gets whether or not it is vaccinated
	 * @return isVaccinated - isVaccinated
	 */
	public boolean getIsVaccinated()
	{
		return this.isVaccinated;
	}

	/**
	 * sets isVaccinated
	 * @param isVaccinated - the isVaccinated to set
	 */
	public void setIsVaccinated(boolean isVaccinated)
	{
		this.isVaccinated = isVaccinated;
	}

	/**
	 * gets whether or not it is neutered
	 * @return - gets isNeutered
	 */
	public boolean getIsNeutered()
	{
		return isNeutered;
	}

	/**
	 * sets isNeutered
	 * @param isNeutered - the isNeutered to set
	 */
	public void setIsNeutered(boolean isNeutered)
	{
		this.isNeutered = isNeutered;
	}

	/**
	 * gets whether or not it is housebroken
	 * @return - the isHousebroken
	 */
	public boolean getIsHousebroken()
	{
		return this.isHousebroken;
	}

	/**
	 * sets isHousebroken
	 * @param isHousebroken - the isHousebroken to set
	 */
	public void setHousebroken(boolean isHousebroken)
	{
		this.isHousebroken = isHousebroken;
	}

}
