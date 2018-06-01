package ALLCAPS;

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

	//no-arg non-default constructor
	public PlayerStats(){
	}
	
	//10-arg constructor
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
	public void setFirstName(String firstName){
		this.firstName = firstName;	
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;	
	}

	public void setJerseyNumber(int jerseyNumber){
		this.jerseyNumber = jerseyNumber;	
	}

	public void setPosition(String position){
		this.position = position;	
	}
	
	public void setGamesPlayed(int gamesPlayed){
		this.gamesPlayed = gamesPlayed;
	}	
	
	public void setGoals(int goals){
		this.goals = goals;	
	}
	
	public void setAssists(int assists){
		this.assists = assists;
	}	
	
	public void setPoints(int points){
		this.points = points;	
	}
	
	public void setSeasonStartYr(int seasonStartYr){
		this.seasonStartYr = seasonStartYr;	
	}
	
	public void setSeasonEndYr(int seasonEndYr){
		this.seasonEndYr = seasonEndYr;	
	}

	//getters
	public String getFirstName(){
		return firstName;	
	}
	
	public String getLastName(){
		return lastName;	
	}

	public int getJerseyNumber(){
		return jerseyNumber;	
	}

	public String getPosition(){
		return position;	
	}
	
	public int getGamesPlayed(){
		return gamesPlayed;
	}	
	
	public int getGoals(){
		return goals;	
	}
	
	public int getAssists(){
		return assists;
	}	
	
	public int getPoints(){
		return points;	
	}
	
	public int getSeasonStartYr(){
		return seasonStartYr;	
	}
	
	public int getSeasonEndYr(){
		return seasonEndYr;	
	}

	//additional methods
	public String formatInfo(){
		return getFirstName() + " " + getLastName() + " | #" + getJerseyNumber() + " | " + getPosition() +
		"\nSeason: " + getSeasonStartYr() + " - " + getSeasonEndYr() +
		"\nGames Played: " + getGamesPlayed() +
		"\nGoals: " + getGoals() +
		"\nAssists: " + getAssists() +
		"\nPoints: " + getPoints() + "\n";
	}
	
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