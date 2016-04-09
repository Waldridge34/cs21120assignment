package cs21120.assignment;

import java.io.FileNotFoundException;

public class Play {

	public void main() throws FileNotFoundException{
	
		start();
		
	}
	
	public void start() throws FileNotFoundException{
		CompetitionManager CompManger = new CompetitionManager(null);
		CompManger.runCompetition("Teams.txt");
	}
}