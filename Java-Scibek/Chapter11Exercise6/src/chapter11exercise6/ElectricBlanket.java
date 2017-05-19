package chapter11exercise6;

public class ElectricBlanket extends Blanket
{
	protected int heatSettings;
	protected boolean autoShutOff;

	/**
	 * builds an electric blanket
	 */
	public ElectricBlanket()
	{
		super();
		this.heatSettings = 1;
		this.autoShutOff = false;
	}

	/**
	 * return the heat settings
	 * @return - the heat settings
	 */
	public int getHeatSettings()
	{
		return this.heatSettings;
	}

	/**
	 * gets the auto shut off
	 * @return - the auto shut off
	 */
	public boolean getAutoShutOff()
	{
		return this.autoShutOff;
	}

	/**
	 * sets the heat settings
	 * @param newSettings - the new heat settings
	 */
	public void setHeatSettings(int newSettings)
	{
		if(newSettings > 5 || newSettings < 0)
		{
			this.heatSettings = 1;
		}
		else
		{
			this.heatSettings = newSettings;
		}
	}

	/**
	 * sets the auto shut off
	 * @param newShutOff - the new shut off settings
	 */
	public void setAutoShutOff(boolean newShutOff)
	{
		this.autoShutOff = newShutOff;
		if(newShutOff)
		{
			this.price += 5.75;
		}
	}

	/**
	 * converts the blanket to a string
	 */
	public String toString()
	{
		return super.toString() + "Number of Heat Settings: "
				+ this.heatSettings + "\nAuto Shut Off Feature: "
				+ this.autoShutOff + "\n";
	}
}
