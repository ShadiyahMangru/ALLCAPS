package ALLCAPS;
/**
* The PlayerStats class organizes the variables we will track for each team member.  
* Variables that change during the season (games played, goals, assists, points) have associated 
* mutator methods described below
*
* @author  Shadiyah Mangru
* @version 1.0
* @since   June 2018
*/

public class PlayerStats{
	//fields
	private String firstName;
	private String lastName;
	private int jerseyNumber;
	private String position;
	private int gamesPlayed;
	private int goals;
	private int assists;
	private int points;
	private int seasonStartYr;
	private int seasonEndYr;

	//constructors
	/**
	* No-argument, non-default constructor
	*/
	public PlayerStats(){
	}
	
	/**
	* Comprehensive constructor -- initializes all player variables. 
	* Once these variables have been initialized, only the games played, goals, assists, and points
	*variables may be subsequently changed
	* @param fn player's first name
	* @param ln player's last name
	* @param jn player's jersey number
	* @param p player's position
	* @param gp games played by player
	* @param g goals by player
	* @param a assists by player
	* @param pt player's points
	* @param ssy season start year
	* @param sey season end year
	*/
	public PlayerStats(String fn, String ln, int jn, String p, int gp, int g, int a, int pt, int ssy, int sey){
		firstName = fn;
		lastName = ln;
		jerseyNumber = jn;
		position = p;
		gamesPlayed = gp;
		goals = g;
		assists = a;
		points = pt;
		seasonStartYr = ssy;
		seasonEndYr = sey;
	}
	
	//setters
	/**
	* sets how many games played by the player this season 
	*@param gamesPlayed games played by player
	*/
	public void setGamesPlayed(int gamesPlayed){
		this.gamesPlayed = gamesPlayed;
	}	
	
	/**
	* sets the number of goals scored by the player this season
	*@param goals goals by player
	*/
	public void setGoals(int goals){
		this.goals = goals;	
	}
	
	/**
	* sets the number of assists by the player this season
	*@param assists by player
	*/
	public void setAssists(int assists){
		this.assists = assists;
	}	
	
	/**
	* sets the points earned by the player this season
	*@param points player's points
	*/
	public void setPoints(int points){
		this.points = points;	
	}

	//getters
	/**
	* returns the player's first name
	*@return String player's first name 
	*/
	public String getFirstName(){
		return firstName;	
	}
	
	/**
	* returns the player's last name
	*@return String player's last name 
	*/
	public String getLastName(){
		return lastName;	
	}

	/**
	* returns the player's jersey number
	*@return int player's jersey number 
	*/
	public int getJerseyNumber(){
		return jerseyNumber;	
	}

	/**
	* returns the player's position
	*@return String player's position 
	*/
	public String getPosition(){
		return position;	
	}
	
	/**
	* returns the current number of games played by the player this season
	*@return int games played by player 
	*/
	public int getGamesPlayed(){
		return gamesPlayed;
	}	
	
	/**
	* returns the current number of goals scored by the player this season
	*@return int goals by player 
	*/
	public int getGoals(){
		return goals;	
	}
	
	/**
	* returns the current number of assists by the player this season
	*@return int assists by player
	*/
	public int getAssists(){
		return assists;
	}	
	
	/**
	* returns the current number of points earned by the player this season
	*@return int points earned by player
	*/
	public int getPoints(){
		return points;	
	}
	
	/**
	* returns the season start year of this object's data
	*@return int season start year
	*/
	public int getSeasonStartYr(){
		return seasonStartYr;	
	}
	
	/**
	* returns the season end year of this object's data
	*@return int season end year
	*/
	public int getSeasonEndYr(){
		return seasonEndYr;	
	}

	//additional methods
	/**
	* formats all available variables for printing
	* @return String of player's stats (season start and end year included in output)
	*/
	public String formatInfo(){
		return getFirstName() + " " + getLastName() + " | #" + getJerseyNumber() + " | " + getPosition() +
		"\nSeason: " + getSeasonStartYr() + " - " + getSeasonEndYr() +
		"\nGames Played: " + getGamesPlayed() +
		"\nGoals: " + getGoals() +
		"\nAssists: " + getAssists() +
		"\nPoints: " + getPoints() + "\n";
	}
	
	/**
	* formats variables for printing
	* @return String of player's stats (season start and end year NOT included in output)
	*/
	public String formatInfoRegSeason(int seasonStartYear){
		if(getSeasonStartYr()==seasonStartYear){
			return getFirstName() + " " + getLastName() + " | #" + getJerseyNumber() + " | " + getPosition() +
			"\nGames Played: " + getGamesPlayed() +
			"\nGoals: " + getGoals() +
			"\nAssists: " + getAssists() +
			"\nPoints: " + getPoints() + "\n";
		}
		else{
			return "";	
		}
	}
}