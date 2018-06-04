package ALLCAPS;
/**
* The PlayerStats class organizes the statistics that we will track for each team member
* during a given season.
* Variables that change during the season (games played, goals, assists, points) have associated 
* mutator methods described below
*
* @author  Shadiyah Mangru
* @version 1.0
* @since   June 2018
*/

public class PlayerStats extends Player{
	//fields
	private int gamesPlayed;
	private int goals;
	private int assists;
	private int points;
	private int seasonStartYr;

	//constructor
	/**
	* Comprehensive constructor -- initializes all player variables. 
	* Once these variables have been initialized, only the games played, goals, assists, and points
	* variables may be subsequently changed
	* @param player single variable that stores player's first and last name, jersey number, and position
	* @param gp games played by player
	* @param g goals by player
	* @param a assists by player
	* @param pt player's points
	* @param ssy season start year
	*/
	public PlayerStats(Player player, int gp, int g, int a, int pt, int ssy){
		super(player);
		gamesPlayed = gp;
		goals = g;
		assists = a;
		points = pt;
		seasonStartYr = ssy;
	}
	
	//setters
	/**
	* sets how many games played by the player this season 
	* @param gamesPlayed games played by player
	*/
	public void setGamesPlayed(int gamesPlayed){
		this.gamesPlayed = gamesPlayed;
	}	
	
	/**
	* sets the number of goals scored by the player this season
	* @param goals goals scored by player
	*/
	public void setGoals(int goals){
		this.goals = goals;	
	}
	
	/**
	* sets the number of assists by the player this season
	* @param assists assists by player
	*/
	public void setAssists(int assists){
		this.assists = assists;
	}	
	
	/**
	* sets the points earned by the player this season
	* @param points points earned by player
	*/
	public void setPoints(int points){
		this.points = points;	
	}

	//getters	
	/**
	* returns the current number of games played by the player this season
	* @return int games played by player 
	*/
	public int getGamesPlayed(){
		return gamesPlayed;
	}	
	
	/**
	* returns the current number of goals scored by the player this season
	* @return int goals by player 
	*/
	public int getGoals(){
		return goals;	
	}
	
	/**
	* returns the current number of assists by the player this season
	* @return int assists by player
	*/
	public int getAssists(){
		return assists;
	}	
	
	/**
	* returns the current number of points earned by the player this season
	* @return int points earned by player
	*/
	public int getPoints(){
		return points;	
	}
	
	/**
	* returns the season start year that corresponds to this instance's data
	* @return int season start year
	*/
	public int getSeasonStartYr(){
		return seasonStartYr;	
	}

	//methods to format each instance of the Player class' data output
	/**
	* formats all available variables for display
	* @return String of player's stats (season start and end year included in output)
	*/
	public String formatInfo(){
		return getFirstName() + " " + getLastName() + " | #" + getJerseyNumber() + " | " + getPosition() +
		"\nSeason: " + getSeasonStartYr() + " - " + (getSeasonStartYr()+1) +
		"\nGames Played: " + getGamesPlayed() +
		"\nGoals: " + getGoals() +
		"\nAssists: " + getAssists() +
		"\nPoints: " + getPoints() + "\n";
	}
	
	/**
	* formats variables for display
	* @return String of player's stats (season start and end year NOT included in output)
	*/
	public String formatInfoRegSeason(){
			return getFirstName() + " " + getLastName() + " | #" + getJerseyNumber() + " | " + getPosition() +
			"\nGames Played: " + getGamesPlayed() +
			"\nGoals: " + getGoals() +
			"\nAssists: " + getAssists() +
			"\nPoints: " + getPoints() + "\n";
	}
}