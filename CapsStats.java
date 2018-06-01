package ALLCAPS;

import java.util.*;
public class CapsStats{
	
	private ArrayList<PlayerStats> teamStats = new ArrayList<PlayerStats>();
	
	//no-arg non-default constructor
	public CapsStats(){
		setTeamStats();	
	}
	
	public void setTeamStats(){
		PlayerStats ovechkin = new PlayerStats("Alex", "Ovechkin", 8, "LW", 82, 49, 38, 87, 2017, 2018);
		teamStats.add(ovechkin);
		PlayerStats kuznetsov = new PlayerStats("Evgeny", "Kuznetsov", 92, "C", 79, 27, 56, 83, 2017, 2018);
		teamStats.add(kuznetsov);
		PlayerStats backstrom = new PlayerStats("Nicklas", "Backstrom", 19, "C", 81, 21, 50, 71, 2017, 2018);
		teamStats.add(backstrom);
		PlayerStats oshie = new PlayerStats("TJ", "Oshie", 77, "RW", 74, 18, 29, 47, 2017, 2018);
		teamStats.add(oshie);
		PlayerStats eller = new PlayerStats("Lars", "Eller", 20, "C", 81, 18, 20, 38, 2017, 2018);
		teamStats.add(eller);
		PlayerStats carlson = new PlayerStats("John", "Carlson", 74, "D", 82, 15, 53, 68, 2017, 2018); 
		teamStats.add(carlson);
		PlayerStats wilson = new PlayerStats("Tom", "Wilson", 43, "RW", 78, 14, 21, 35, 2017, 2018);
		teamStats.add(wilson);
		PlayerStats orlov = new PlayerStats("Orlov", "Dmitry", 9, "D", 82, 10, 21, 31, 2017, 2018);
		teamStats.add(orlov);
		PlayerStats niskanen = new PlayerStats("Matt", "Niskanen", 2, "D", 68, 7, 22, 29, 2017, 2018);
		teamStats.add(niskanen);
		PlayerStats connolly = new PlayerStats("Brett", "Connolly", 10, "RW", 70, 15, 12, 27, 2017, 2018);
		teamStats.add(connolly);
		PlayerStats vrana = new PlayerStats("Jakub", "Vrana", 13, "LW", 73, 13, 14, 27, 2017, 2018);
		teamStats.add(vrana);
		PlayerStats burakovsky = new PlayerStats("Andre", "Burakovsky", 65, "LW", 56, 12, 13, 25, 2017, 2018);
		teamStats.add(burakovsky);	
		PlayerStats beagle = new PlayerStats("Jay", "Beagle", 83, "C", 79, 7, 15, 22, 2017, 2018);
		teamStats.add(beagle);
		PlayerStats chiasson = new PlayerStats("Alex", "Chiasson", 39, "RW", 61, 9, 9, 18, 2017, 2018);
		teamStats.add(chiasson);
		PlayerStats stephenson = new PlayerStats("Chandler", "Stephenson", 18, "C", 67, 6, 12, 18, 2017, 2018);
		teamStats.add(stephenson);
		PlayerStats smithpelly = new PlayerStats("Devante", "Smith-Pelly", 25, "RW", 75, 7, 9, 16, 2017, 2018);
		teamStats.add(smithpelly);
		PlayerStats djoos = new PlayerStats("Christian", "Djoos", 29, "D", 63, 3, 11, 14, 2017, 2018);
		teamStats.add(djoos);
		PlayerStats bowey = new PlayerStats("Madison", "Bowey", 22, "D", 51, 0, 12, 12, 2017, 2018);
		teamStats.add(bowey);
		PlayerStats orpik = new PlayerStats("Brooks", "Orpik", 44, "D", 81, 0, 10, 10, 2017, 2018);
		teamStats.add(orpik);
		PlayerStats jerabek = new PlayerStats("Jakub", "Jerabek", 28, "D", 11, 1, 3, 4, 2017, 2018);
		teamStats.add(jerabek);
		PlayerStats kempny = new PlayerStats("Michael", "Kempny", 6, "D", 22, 2, 1, 3, 2017, 2018);
		teamStats.add(kempny);
		PlayerStats walker = new PlayerStats("Nathan", "Walker", 79, "LW", 7, 1, 0, 1, 2017, 2018);
		teamStats.add(walker);
		PlayerStats boyd = new PlayerStats("Travis", "Boyd", 72, "C", 8, 0, 1, 1, 2017, 2018);
		teamStats.add(boyd);
		PlayerStats gersich = new PlayerStats("Shane", "Gersich", 63, "LW", 3, 0, 1, 1, 2017, 2018);
		teamStats.add(gersich);
	}

	public ArrayList<PlayerStats> getTeamStats(){
		return teamStats;	
	}
	
	public void formatTeamInfo(){
		for(int i=0; i<teamStats.size(); i++){
			System.out.println(teamStats.get(i).formatInfo());	
		}
		
	}
	
	public void formatTeamInfoRegSeason(int seasonStartYear){
		for(int i=0; i<teamStats.size();i++){
			if(teamStats.get(i).getSeasonStartYr()==seasonStartYear){
				System.out.println(teamStats.get(i).formatInfoRegSeason(seasonStartYear));	
			}
		}
	}
	
	public void sortByGamesPlayed(int seasonStartYear){
		ArrayList<PlayerStats> teamStatsByGamesPlayed = new ArrayList<PlayerStats>();
		SortStats.sortByAField(seasonStartYear, teamStatsByGamesPlayed, teamStats, 0);	
	}
	
	public void sortByGoals(int seasonStartYear){
		ArrayList<PlayerStats> teamStatsByGoals = new ArrayList<PlayerStats>();
		SortStats.sortByAField(seasonStartYear, teamStatsByGoals, teamStats, 1);
	}
	
	public void sortByAssists(int seasonStartYear){
		ArrayList<PlayerStats> teamStatsByAssists = new ArrayList<PlayerStats>();
		SortStats.sortByAField(seasonStartYear, teamStatsByAssists, teamStats, 2);
	}
	
	public void sortByPoints(int seasonStartYear){
		ArrayList<PlayerStats> teamStatsByPoints = new ArrayList<PlayerStats>();
		SortStats.sortByAField(seasonStartYear, teamStatsByPoints, teamStats, 3);
	}
	
	//uncomment method to run from the choices below
	public static void main(String[] args){
		CapsStats newInst = new CapsStats();
		//newInst.formatTeamInfoRegSeason(2017);
		//newInst.sortByGamesPlayed(2017);
		//newInst.sortByGoals(2017);
		//newInst.sortByAssists(2017); 
		newInst.sortByPoints(2017);
	}
	
	
}