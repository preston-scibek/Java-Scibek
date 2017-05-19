package chapter9exercise3;

public class Recording
{
	private String songTitle;
	private String songArtist;
	private String songPlayTime;

	/**
	 * creates a recording class and assigns object
	 * @param titleSong - title of song
	 * @param artistSong - artist name
	 * @param timeSongPlay - length of song
	 */
	public Recording(String titleSong, String artistSong, String timeSongPlay)
	{
		this.songTitle = titleSong;
		this.songArtist = artistSong;
		this.songPlayTime = timeSongPlay;
	}

	/**
	 * gets the song title
	 * @return - the song title
	 */
	public String getTitle()
	{
		return this.songTitle;
	}

	/**
	 * gets the song artist
	 * @return - the artist of the song
	 */
	public String getArtist()
	{
		return this.songArtist;
	}

	/**
	 * gets the length of the song
	 * @return - the length of the song
	 */
	public String getPlayTime()
	{
		return this.songPlayTime;
	}

	/**
	 * sets the song artist
	 * @param newArtist - new artist of the song
	 */
	public void setArtist(String newArtist)
	{
		this.songArtist = newArtist;
	}

	/**
	 * sets the song title
	 * @param newTitle - new title of the song
	 */
	public void setTitle(String newTitle)
	{
		this.songTitle = newTitle;
	}

	/**
	 * sets the song length
	 * @param newLength - new length of the song
	 */
	public void setLength(String newLength)
	{
		this.songPlayTime = newLength;
	}

}
