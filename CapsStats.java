package ALLCAPS;
import java.util.*;

/**
* The CapsStats class aggregates team statistics.  Current and former Washington Capitals team members
* comprise this class' fields.  Methods exist to set and get the roster's stats per season.  Methods also
* exist to sort each season's roster by games played, goals scored, assists made, and points earned.  Finally,
* this class includes two print formatting methods to output each season's team stats.
*
* @author Shadiyah Mangru
* @version 1.0
* @since June 2018
*/

public class CapsStats{
	private static final Player ALZNER = new Player("Karl", "Alzner", 27, "D");
	private static final Player BACKSTROM = new Player("Nicklas", "Backstrom", 19, "C");
	private static final Player BARBER = new Player("Riley", "Barber", 24, "RW");
	private static final Player BEAGLE = new Player("Jay", "Beagle", 83, "C");
	private static final Player BOWEY = new Player("Madison", "Bowey", 22, "D");
	private static final Player BOYD = new Player("Travis", "Boyd", 72, "C");
	private static final Player BURAKOVSKY = new Player("Andre", "Burakovsky", 65, "LW");
	private static final Player CAREY = new Player("Paul", "Carey", 28, "RW");
	private static final Player CARLSON = new Player("John", "Carlson", 74, "D");
	private static final Player CHIASSON = new Player("Alex", "Chiasson", 39, "RW");
	private static final Player CHORNEY = new Player("Taylor", "Chorney", 4, "D");
	private static final Player CONNOLLY = new Player("Brett", "Connolly", 10, "RW");
	private static final Player DJOOS = new Player("Christian", "Djoos", 29, "D");
	private static final Player ELLER = new Player("Lars", "Eller", 20, "C");
	private static final Player GERSICH = new Player("Shane", "Gersich", 63, "LW");
	private static final Player JERABEK = new Player("Jakub", "Jerabek", 28, "D");
	private static final Player JOHANSSON = new Player("Marcus", "Johannson", 90, "LW");
	private static final Player KEMPNY = new Player("Michael", "Kempny", 6, "D");
	private static final Player KUZNETSOV = new Player("Evgeny", "Kuznetsov", 92, "C");
	private static final Player MITCHELL = new Player("Garrett", "Mitchell", 76, "RW");
	private static final Player NESS = new Player("Aaron", "Ness", 55, "D");
	private static final Player NISKANEN = new Player("Matt", "Niskanen", 2, "D");
	private static final Player OBRIEN = new Player("Liam", "O'Brien", 87, "LW");
	private static final Player ORLOV = new Player("Dmitry", "Orlov", 9, "D");
	private static final Player ORPIK = new Player("Brooks", "Orpik", 44, "D");
	private static final Player OSHIE = new Player("TJ", "Oshie", 77, "RW");
	private static final Player OVECHKIN = new Player("Alex", "Ovechkin", 8, "LW");
	private static final Player SANFORD = new Player("Zach", "Sanford", 82, "C");
	private static final Player SCHMIDT = new Player("Nate", "Schmidt", 88, "D");
	private static final Player SHATTENKIRK = new Player("Kevin", "Shattenkirk", 22, "D");
	private static final Player SMITH_PELLY = new Player("Devante", "Smith-Pelly", 25, "RW");
	private static final Player STEPHENSON = new Player("Chandler", "Stephenson", 18, "C");
	private static final Player VRANA = new Player("Jakub", "Vrana", 13, "LW");
	private static final Player WALKER = new Player("Nathan", "Walker", 79, "LW");
	private static final Player WILLIAMS = new Player("Justin", "Williams", 14, "RW");
	private static final Player WILSON = new Player("Tom", "Wilson", 43, "RW");
	private static final Player WINNIK = new Player("Daniel", "Winnik", 26, "LW");
	
	private ArrayList<PlayerStats> teamStats2017 = new ArrayList<PlayerStats>();
	private ArrayList<PlayerStats> teamStats2016 = new ArrayList<PlayerStats>();
	
	//no-arg, non-default constructor
	/**
	* No-argument, comprehensive constructor -- initializes player variables for each season's roster.
	*/
	public CapsStats(){
		setTeamStats2017();
		setTeamStats2016();
	}
	
	/**
	* sets 2017-2018 season's statistics for the entire Washington Capitals roster.
	*/
	public void setTeamStats2017(){
		teamStats2017.add(new PlayerStats(OVECHKIN, 82, 49, 38, 87, 2017));
		teamStats2017.add(new PlayerStats(KUZNETSOV, 79, 27, 56, 83, 2017));
		teamStats2017.add(new PlayerStats(BACKSTROM, 81, 21, 50, 71, 2017));
		teamStats2017.add(new PlayerStats(OSHIE, 74, 18, 29, 47, 2017));
		teamStats2017.add(new PlayerStats(ELLER, 81, 18, 20, 38, 2017));
		teamStats2017.add(new PlayerStats(CARLSON, 82, 15, 53, 68, 2017)); 
		teamStats2017.add(new PlayerStats(WILSON, 78, 14, 21, 35, 2017));
		teamStats2017.add(new PlayerStats(ORLOV, 82, 10, 21, 31, 2017));
		teamStats2017.add(new PlayerStats(NISKANEN, 68, 7, 22, 29, 2017));
		teamStats2017.add(new PlayerStats(CONNOLLY, 70, 15, 12, 27, 2017));
		teamStats2017.add(new PlayerStats(VRANA, 73, 13, 14, 27, 2017));
		teamStats2017.add(new PlayerStats(BURAKOVSKY, 56, 12, 13, 25, 2017));
		teamStats2017.add(new PlayerStats(BEAGLE, 79, 7, 15, 22, 2017));
		teamStats2017.add(new PlayerStats(CHIASSON, 61, 9, 9, 18, 2017));
		teamStats2017.add(new PlayerStats(STEPHENSON, 67, 6, 12, 18, 2017));
		teamStats2017.add(new PlayerStats(SMITH_PELLY, 75, 7, 9, 16, 2017));
		teamStats2017.add(new PlayerStats(DJOOS, 63, 3, 11, 14, 2017));
		teamStats2017.add(new PlayerStats(BOWEY, 51, 0, 12, 12, 2017));
		teamStats2017.add(new PlayerStats(ORPIK, 81, 0, 10, 10, 2017));
		teamStats2017.add(new PlayerStats(JERABEK, 11, 1, 3, 4, 2017));
		teamStats2017.add(new PlayerStats(KEMPNY, 22, 2, 1, 3, 2017));
		teamStats2017.add(new PlayerStats(WALKER, 7, 1, 0, 1, 2017));
		teamStats2017.add(new PlayerStats(BOYD, 8, 0, 1, 1, 2017));
		teamStats2017.add(new PlayerStats(GERSICH, 3, 0, 1, 1, 2017));
	}
	
	/**
	* sets 2016-2017 season's statistics for the entire Washington Capitals roster.
	*/
	public void setTeamStats2016(){
		teamStats2016.add(new PlayerStats(BACKSTROM, 82, 23, 63, 86, 2016));
		teamStats2016.add(new PlayerStats(OVECHKIN, 82, 33, 36, 69, 2016));
		teamStats2016.add(new PlayerStats(KUZNETSOV, 82, 19, 40, 59, 2016));
		teamStats2016.add(new PlayerStats(JOHANSSON, 82, 24, 34, 58, 2016));
		teamStats2016.add(new PlayerStats(ORLOV, 82, 6, 27, 33, 2016));
		teamStats2016.add(new PlayerStats(WILSON, 82, 7, 12, 19, 2016));
		teamStats2016.add(new PlayerStats(ALZNER, 82, 3, 10, 13, 2016));
		teamStats2016.add(new PlayerStats(BEAGLE, 81, 13, 17, 30, 2016));
		teamStats2016.add(new PlayerStats(ELLER, 81, 12, 13, 25, 2016));
		teamStats2016.add(new PlayerStats(WILLIAMS, 80, 24, 24, 48, 2016));
		teamStats2016.add(new PlayerStats(ORPIK, 79, 0, 14, 14, 2016));
		teamStats2016.add(new PlayerStats(NISKANEN, 78, 5, 34, 39, 2016));
		teamStats2016.add(new PlayerStats(CARLSON, 72, 9, 28, 37, 2017)); 
		teamStats2016.add(new PlayerStats(WINNIK, 72, 12, 13, 25, 2016));
		teamStats2016.add(new PlayerStats(OSHIE, 68, 33, 23, 56, 2016));
		teamStats2016.add(new PlayerStats(CONNOLLY, 66, 15, 8, 23, 2016));
		teamStats2016.add(new PlayerStats(BURAKOVSKY, 64, 12, 23, 35, 2016));
		teamStats2016.add(new PlayerStats(SCHMIDT, 60, 3, 14, 17, 2016));
		teamStats2016.add(new PlayerStats(SANFORD, 26, 2, 1, 3, 2016));
		teamStats2016.add(new PlayerStats(VRANA, 21, 3, 3, 6, 2016));
		teamStats2016.add(new PlayerStats(SHATTENKIRK, 19, 2, 12, 14, 2016));
		teamStats2016.add(new PlayerStats(CHORNEY, 18, 1, 4, 5, 2016));
		teamStats2016.add(new PlayerStats(CAREY, 6, 0, 0, 0, 2016));
		teamStats2016.add(new PlayerStats(STEPHENSON, 4, 0, 0, 0, 2016));
		teamStats2016.add(new PlayerStats(BARBER, 3, 0, 0, 0, 2016));
		teamStats2016.add(new PlayerStats(NESS, 2, 0, 0, 0, 2016));
		teamStats2016.add(new PlayerStats(MITCHELL, 1, 0, 0, 0, 2016));
		teamStats2016.add(new PlayerStats(OBRIEN, 1, 0, 0, 0, 2016));
	}
	
	/**
	* returns 2017-2018 season's statistics for the entire Washington Capitals roster.
	* @return ArrayList teamStats2017 2017 team statistics
	*/
	public ArrayList<PlayerStats> getTeamStats2017(){
		return teamStats2017;	
	}
	
	/**
	* returns 2016-2017 season's statistics for the entire Washington Capitals roster.
	* @return ArrayList teamStats2016 2016 team statistics
	*/
	public ArrayList<PlayerStats> getTeamStats2016(){
		return teamStats2016;	
	}
	
	/**
	* outputs the player stats (season start and end year included) for each member 
	* of the Washington Capitals' roster
	* @param teamStats roster to print by season start year
	*/
	public void formatTeamInfo(ArrayList<PlayerStats> teamStats){
		for(int i=0; i<teamStats.size(); i++){
			System.out.println(teamStats.get(i).formatInfo());	
		}
	}
	
	/**
	* outputs the player stats (season start and end year NOT included) for each member 
	* of the Washington Capitals' roster
	* @param teamStats roster to print by season start year
	*/
	public void formatTeamInfoRegSeason(ArrayList<PlayerStats> teamStats){
		for(int i=0; i<teamStats.size();i++){
			System.out.println(teamStats.get(i).formatInfoRegSeason());	
		}
	}
	
	/**
	* a method that sorts the roster by games played
	* @param teamStats roster to sort by season start year
	*/
	public void sortByGamesPlayed(ArrayList<PlayerStats> teamStats){
		ArrayList<PlayerStats> teamStatsByGamesPlayed = new ArrayList<PlayerStats>();
		SortStats.sortByAField(teamStatsByGamesPlayed, teamStats, 0);	
	}
	
	/**
	* a method that sorts the roster by goals scored by player
	* @param teamStats roster to sort by season start year
	*/
	public void sortByGoals(ArrayList<PlayerStats> teamStats){
		ArrayList<PlayerStats> teamStatsByGoals = new ArrayList<PlayerStats>();
		SortStats.sortByAField(teamStatsByGoals, teamStats, 1);
	}
	
	/**
	* a method that sorts the roster by assists made by player
	* @param teamStats roster to sort by season start year
	*/
	public void sortByAssists(ArrayList<PlayerStats> teamStats){
		ArrayList<PlayerStats> teamStatsByAssists = new ArrayList<PlayerStats>();
		SortStats.sortByAField(teamStatsByAssists, teamStats, 2);
	}
	
	/**
	* a method that sorts the roster by points earned by player
	* @param teamStats roster to sort by season start year
	*/
	public void sortByPoints(ArrayList<PlayerStats> teamStats){
		ArrayList<PlayerStats> teamStatsByPoints = new ArrayList<PlayerStats>();
		SortStats.sortByAField(teamStatsByPoints, teamStats, 3);
	}
	
	//uncomment method to run from the choices below
	public static void main(String[] args){
		CapsStats newInst = new CapsStats();
		//newInst.formatTeamInfo(newInst.getTeamStats2016());
		//newInst.formatTeamInfoRegSeason(newInst.getTeamStats2016());
		//newInst.sortByGamesPlayed(newInst.teamStats2016);
		newInst.sortByGoals(newInst.teamStats2016);
		//newInst.sortByAssists(newInst.teamStats2016); 
		//newInst.sortByPoints(newInst.teamStats2016);
		
		//newInst.formatTeamInfo(newInst.getTeamStats2017());
		//newInst.formatTeamInfoRegSeason(newInst.getTeamStats2017());
		//newInst.sortByGamesPlayed(newInst.teamStats2017);
		//newInst.sortByGoals(newInst.teamStats2017);
		//newInst.sortByAssists(newInst.teamStats2017); 
		//newInst.sortByPoints(newInst.teamStats2017);
	}
	
	
}