package chapter9exercise3;

import java.util.Scanner;

public class RecordingSort
{
	/**
	 * gets user input for recordings
	 */
	public static void sortRecordings()
	{
		Scanner userKeyboard = new Scanner(System.in);
		Recording[] recordingList = new Recording[5];
		int inc = 0;
		String songTitle;
		String songArtist;
		String songLength;
		for(inc = 0; inc < recordingList.length; inc++)
		{
			System.out.print("\nEnter the song title: ");
			songTitle = userKeyboard.nextLine();
			System.out.print("\nEnter the song artist: ");
			songArtist = userKeyboard.nextLine();
			System.out.print("\nEnter the song length: ");
			songLength = userKeyboard.nextLine();
			recordingList[inc] =
					new Recording(songTitle, songArtist, songLength);
		}
		String whatToSortBy;
		System.out.print("\nType 'title' to sort by title, 'artist' to sort"
				+ " by artist, and 'length' to sort by length: ");
		whatToSortBy = userKeyboard.nextLine();
		int incTwo;
		Recording tempString;
		switch (whatToSortBy)
		{
			case "title":
				for(inc = 0; inc < recordingList.length - 1; inc++)
				{
					for(incTwo = 0; incTwo < recordingList.length - 1; incTwo++)
					{
						if(recordingList[incTwo].getTitle().compareToIgnoreCase(
								recordingList[incTwo + 1].getTitle()) > 0)
						{
							tempString = recordingList[incTwo];
							recordingList[incTwo] = recordingList[incTwo + 1];
							recordingList[incTwo + 1] = tempString;
						}
					}
				}
				for(inc = 0; inc < recordingList.length; inc++)
				{
					System.out.println("Artist: "
							+ recordingList[inc].getArtist() + " Title: "
							+ recordingList[inc].getTitle() + "Length: "
							+ recordingList[inc].getPlayTime());
				}
				break;
			case "artist":
				for(inc = 0; inc < recordingList.length - 1; inc++)
				{
					for(incTwo = 0; incTwo < recordingList.length - 1; incTwo++)
					{
						if(recordingList[incTwo].getArtist()
								.compareToIgnoreCase(recordingList[incTwo + 1]
										.getArtist()) > 0)
						{
							tempString = recordingList[incTwo];
							recordingList[incTwo] = recordingList[incTwo + 1];
							recordingList[incTwo + 1] = tempString;
						}
					}
				}
				for(inc = 0; inc < recordingList.length; inc++)
				{

					System.out.println("Artist: "
							+ recordingList[inc].getArtist() + " Title: "
							+ recordingList[inc].getTitle() + "Length: "
							+ recordingList[inc].getPlayTime());
				}
				break;
			case "length":
				for(inc = 0; inc < recordingList.length - 1; inc++)
				{
					for(incTwo = 0; incTwo < recordingList.length - 1; incTwo++)
					{
						if(recordingList[incTwo].getPlayTime()
								.compareToIgnoreCase(recordingList[incTwo + 1]
										.getPlayTime()) > 0)
						{
							tempString = recordingList[incTwo];
							recordingList[incTwo] = recordingList[incTwo + 1];
							recordingList[incTwo + 1] = tempString;
						}
					}
				}
				for(inc = 0; inc < recordingList.length; inc++)
				{
					System.out.println("Artist: "
							+ recordingList[inc].getArtist() + " Title: "
							+ recordingList[inc].getTitle() + "Length: "
							+ recordingList[inc].getPlayTime());
				}
				break;
			default:
				break;
		}
		userKeyboard.close();
	}

	public static void main(String[] args)
	{
		sortRecordings();
	}
}
